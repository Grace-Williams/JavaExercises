package section8;

public class Video69_Bedroom {

    private Video69_Wall wall1;
    private Video69_Wall wall2;
    private Video69_Wall wall3;
    private Video69_Wall wall4;

    private Video69_Lamp lamp;
    private Video69_Bed bed;

    public Video69_Bedroom(Video69_Wall wall1, Video69_Wall wall2, Video69_Wall wall3, Video69_Wall wall4, Video69_Lamp lamp, Video69_Bed bed) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Video69_Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        bed.make();
    }
}

// Create a single room of a house using composition
// Think about the things that should be included in the room
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class like you saw in the video

