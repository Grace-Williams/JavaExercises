package Section8;

public class Video69_Bed {

    private int length;
    private int height;
    private int width;
    private String style;

    public Video69_Bed(int length, int height, int width, String style) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.style = style;
    }

    public void make(){
        System.out.println("Video69_Bed -> Making bed.");
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
