package section8.lecture69;

public class Wall {

    private String directionOfWall;
    private int length;
    private int width;

    public Wall(String directionOfWall, int length, int width) {
        this.directionOfWall = directionOfWall;
        this.length = length;
        this.width = width;
    }

    public String getDirectionOfWall() {
        return directionOfWall;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}

// Create a single room of a house using composition
// Think about the things that should be included in the room
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class like you saw in the video

