package section8.lecture73;

public class Car {

    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine(){
        return "Car -> startEngine() called";
    }

    public String accelerate(){
        return "Car -> accelerate() called";
    }

    public String brake(){
        return "Car -> brake() called";
    }
}

// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class
// engines, cylinders, wheels, etc.
// Constructor should initialise cylinders (number of) and name, set wheels to 4
// and engine to true.  Cylinders and names would be passed parameters

// Create appropriate getters
// Create some methods like startEngine, accelerate and brake
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles
// Override the appropriate methods to demonstrate polymorphism in use
