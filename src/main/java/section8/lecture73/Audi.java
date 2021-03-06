package section8.lecture73;

public class Audi extends Car {

    public Audi(String name, int cylinder) {

        super(name, cylinder);
    }

    @Override
    public String accelerate() {
        return "Audi accelerate() called";
    }

    @Override
    public String startEngine() {
        return "Audi startEngine() called";
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
