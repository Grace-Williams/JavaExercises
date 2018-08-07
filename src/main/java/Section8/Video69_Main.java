package Section8;

public class Video69_Main {

    public static void main(String[] args) {

        Video69_Wall wall1 = new Video69_Wall("north");
        Video69_Wall wall2 = new Video69_Wall("south");
        Video69_Wall wall3 = new Video69_Wall("east");
        Video69_Wall wall4 = new Video69_Wall("west");

        Video69_Lamp lamp = new Video69_Lamp("2010", true);

        Video69_Bed bed = new Video69_Bed(10, 3, 5, "king size");

        Video69_Bedroom bedroom = new Video69_Bedroom(wall1, wall2, wall3, wall4, lamp, bed);
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
