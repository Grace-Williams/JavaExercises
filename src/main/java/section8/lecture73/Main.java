package section8.lecture73;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Unknown name", 0);
        System.out.println(car.getName());
        System.out.println("Number of cylinder: " + car.getCylinder());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("******************");

        BMW bmw = new BMW("BMW i8", 3);
        System.out.println(bmw.getName());
        System.out.println("Number of cylinder: " + bmw.getCylinder());
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
        System.out.println("******************");

        Audi audi = new Audi("Audi r8", 10);
        System.out.println(audi.getName());
        System.out.println("Number of cylinder: " + audi.getCylinder());
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
        System.out.println("******************");

        Porsche porsche = new Porsche("Porsche 911", 6);
        System.out.println(porsche.getName());
        System.out.println("Number of cylinder: " + porsche.getCylinder());
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());
        System.out.println("******************");
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
