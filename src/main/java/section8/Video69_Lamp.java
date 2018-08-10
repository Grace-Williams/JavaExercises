package section8;

public class Video69_Lamp {

    private String yearMade;
    private boolean isBatteryOperated;

    public Video69_Lamp(String yearMade, boolean isBatteryOperated) {
        this.yearMade = yearMade;
        this.isBatteryOperated = isBatteryOperated;
    }

    public void turnOn(){
        System.out.println("Lamp -> Lamp is turned on.");
    }

    public String getYearMade() {
        return yearMade;
    }

    public boolean isBatteryOperated() {
        return isBatteryOperated;
    }
}
