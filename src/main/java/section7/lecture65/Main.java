package section7.lecture65;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Vehicle", 0);
        vehicle.move(10);
        vehicle.stop();
        System.out.println("***************");

        Car car = new Car("Car", 0, 4, 0);
        car.changeGear();
        car.move(2);
        car.move(10);
        car.move(20);
        System.out.println("*************");

        BMW bmw = new BMW("BMW M5", 100, 2, 6, "Black");
        System.out.println(bmw.getName());
        System.out.println(bmw.getCurrentSpeed());
        System.out.println(bmw.getDoor());
        System.out.println(bmw.getGear());
        System.out.println(bmw.getColour());
        bmw.move(60);
        System.out.println("***************");
    }
}

// Inheritance challenge
// Start with  a base class of a Vehicle, then create a Car class that inherits from this base class
// Finally, create another class, a specific type of Car that inherits from the Car class
// You should be able to hand steering, changing gears, and moving (speed)
// You will want to decide where to put the appropriate state and behaviours (fields and methods)
// As mentioned above, changing gears, increasing/decreasing speed should be included
// For your specific type of vehicle, you will want to add something for that type of car