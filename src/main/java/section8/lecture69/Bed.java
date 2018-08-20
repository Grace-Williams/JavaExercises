package section8.lecture69;

public class Bed {

    private int length;
    private int width;
    private int height;
    private String style;

    public Bed(int length, int width, int height, String style) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.style = style;
    }

    public void makeBed() {
        System.out.println("This is makeBed() on Bed class ");
        changeBed();
    }

    private void changeBed() {
        System.out.println("This is change bed on private");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getStyle() {
        return style;
    }
}


// Create a single room of a house using composition
// Think about the things that should be included in the room
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class like you saw in the video
