package section7.lecture65;

public class BMW extends Car {

    private String colour;

    public BMW(String name, int currentSpeed, int door, int gear, String colour) {
        super(name, currentSpeed, door, gear);
        this.colour = colour;
    }

    @Override
    public void move(int speed){
        speed = getCurrentSpeed() + speed;
        System.out.println("The BMW is now moving at " + speed);
    }

    public String getColour() {
        return colour;
    }
}

// Inheritance challenge
// Start with  a base class of a Vehicle, then create a Car class that inherits from this base class
// Finally, create another class, a specific type of Car that inherits from the Car class
// You should be able to hand steering, changing gears, and moving (speed)
// You will want to decide where to put the appropriate state and behaviours (fields and methods)
// As mentioned above, changing gears, increasing/decreasing speed should be included
// For your specific type of vehicle, you will want to add something for that type of car
