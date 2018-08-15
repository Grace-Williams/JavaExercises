package section8.lecture69;

public class Lamp {

    private String yearMade;
    private boolean isBatteryOperated;

    public Lamp(String yearMade, boolean isBatteryOperated) {
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
