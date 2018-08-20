package section8.lecture69;

public class Bedroom {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Lamp lamp;
    private Bed bed;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Bed bed) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }
}

// Create a single room of a house using composition
// Think about the things that should be included in the room
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class like you saw in the video

