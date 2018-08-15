package section8.lecture69;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");

        Lamp lamp = new Lamp("2010", true);

        Bed bed = new Bed(10, 3, 5, "king size");

        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, lamp, bed);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();


    }
}

// Create a single room of a house using composition
// Think about the things that should be included in the room
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class like you saw in the video
