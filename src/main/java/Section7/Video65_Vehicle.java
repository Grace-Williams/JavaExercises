package Section7;

public class Video65_Vehicle {

    private String name;
    private int currentSpeed;


    public Video65_Vehicle(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;

    }

    public void move(int speed){
        speed += this.currentSpeed;
        System.out.println("Vehicle.move() called -> The vehicle is moving with a speed of " + speed);
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle.stop called!");
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

}


// Inheritance challenge
// Start with  a base class of a Vehicle, then create a Car class that inherits from this base class
// Finally, create another class, a specific name of Car that inherits from the Car class
// You should be able to hand steering, changing gears, and moving (speed)
// You will want to decide where to put the appropriate state and behaviours (fields and methods)
// As mentioned above, changing gears, increasing/decreasing speed should be included
// For your specific name of vehicle, you will want to add something for that name of car