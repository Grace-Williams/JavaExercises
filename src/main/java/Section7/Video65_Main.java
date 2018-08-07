package Section7;

public class Video65_Main {

    public static void main(String[] args) {

        Video65_Vehicle vehicle = new Video65_Vehicle("Vehicle", 10);
        vehicle.getCurrentSpeed();
        vehicle.getName();
        vehicle.move(20);
        vehicle.stop();
        System.out.println("***************");

        Video65_BMW bmw = new Video65_BMW("BMW M5", 100, 2, 6, "Black");
        System.out.println(bmw.getName());
        System.out.println(bmw.getCurrentSpeed());
        System.out.println(bmw.getDoor());
        System.out.println(bmw.getGear());
        System.out.println(bmw.getColour());
        bmw.move(60);
        bmw.changeSpeed();
        bmw.stop();
        bmw.getColour();
        System.out.println("***************");
    }
}
