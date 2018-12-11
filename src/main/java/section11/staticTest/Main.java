package section11.staticTest;

public class Main {

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is the instance number " + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is the instance number " + secondInstance.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is the instance number " + thirdInstance.getNumInstances());

    }
}
