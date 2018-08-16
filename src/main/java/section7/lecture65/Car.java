package section7.lecture65;

public class Car extends Vehicle {

    private int door;
    private int gear;

    public Car(String name, int currentSpeed, int door, int gear) {
        super(name, currentSpeed);
        this.door = door;
        this.gear = gear;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        changeGear();
    }

    public int getDoor() {
        return door;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void changeGear(){

        int carSpeed = super.getCurrentSpeed();

        if (carSpeed <= 0){
            super.stop();
        } else if (carSpeed > 0 && carSpeed <= 5 ) {
            setGear(1);
            System.out.println("The Car is currently on gear " + getGear() + ", current speed of " + carSpeed);
        } else if (carSpeed > 5 && carSpeed <= 20 ) {
            setGear(2);
            System.out.println("The Car is currently on gear " + getGear() + ", current speed of " + carSpeed);
        } else if (carSpeed > 20 && carSpeed <= 35 ) {
            setGear(3);
            System.out.println("The Car is currently on gear " + getGear() + ", current speed of " + carSpeed);
        } else if (carSpeed > 35 && carSpeed <= 45 ) {
            setGear(4);
            System.out.println("The Car is currently on gear " + getGear() + ", current speed of " + carSpeed);
        } else {
            setGear(5);
            System.out.println("The Car is currently on gear " + getGear() + ", current speed of " + carSpeed);

        }
    }
}


// Inheritance challenge
// Start with  a base class of a Vehicle, then create a Car class that inherits from this base class
// Finally, create another class, a specific type of Car that inherits from the Car class
// You should be able to hand steering, changing gears, and moving (speed)
// You will want to decide where to put the appropriate state and behaviours (fields and methods)
// As mentioned above, changing gears, increasing/decreasing speed should be included
// For your specific type of vehicle, you will want to add something for that type of car