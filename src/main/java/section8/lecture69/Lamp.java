package section8.lecture69;

public class Lamp {

    private String style;
    private boolean isElectric;
    private int quantity;

    public Lamp(String style, boolean isElectric, int quantity) {
        this.style = style;
        this.isElectric = isElectric;
        this.quantity = quantity;
    }

    public String getStyle() {
        return style;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public int getQuantity() {
        return quantity;
    }

}


// Create a single room of a house using composition
// Think about the things that should be included in the room
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class like you saw in the video
