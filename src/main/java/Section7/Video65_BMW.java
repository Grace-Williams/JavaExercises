package Section7;

public class Video65_BMW extends Video65_Car{

    private String colour;

    public Video65_BMW(String name, int currentSpeed, int door, int gear, String colour) {
        super(name, currentSpeed, door, gear);
        this.colour = colour;
    }

    public void changeSpeed(){
        super.getCurrentSpeed();
        super.move(30);

    }
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
