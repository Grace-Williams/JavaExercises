package section8.lecture69;

public class Bed {

    private int length;
    private int height;
    private int width;
    private String style;

    public Bed(int length, int height, int width, String style) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.style = style;
    }

    public void make(){
        System.out.println("Bed -> Making bed.");
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getStyle() {
        return style;
    }
}
