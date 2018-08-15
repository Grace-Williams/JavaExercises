package section7.lecture65;

public class Car extends Vehicle {

    private int door;
    private int gear;

    public Car(String name, int currentSpeed, int door, int gear) {
        super(name, currentSpeed);
        this.door = door;
        this.gear = gear;
    }

    public String getName(){
        return super.getName();
    }

    @Override
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    public int getDoor() {
        return door;
    }

    public int getGear() {
        return gear;
    }
}


// Inheritance challenge
// Start with  a base class of a Vehicle, then create a Car class that inherits from this base class
// Finally, create another class, a specific type of Car that inherits from the Car class
// You should be able to hand steering, changing gears, and moving (speed)
// You will want to decide where to put the appropriate state and behaviours (fields and methods)
// As mentioned above, changing gears, increasing/decreasing speed should be included
// For your specific type of vehicle, you will want to add something for that type of car