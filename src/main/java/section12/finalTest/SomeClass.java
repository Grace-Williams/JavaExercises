package section12.finalTest;

public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber; // normally, should be declared as private, public is used now for demonstrating purposes
    private final String name;

    public SomeClass(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
