package section8;

public class Video71_Main {

    public static void main(String[] args) {

        Video71_Printer printer = new Video71_Printer(55, 101,true);
        printer.addToner();
        printer.getPagesToPrint();
    }

}

// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real computer printer
// It should have fields for the toner level, number of pages printed
// and also whether its a duplex printer (capable of printing on both sides of the paper)
// Add methods to fill up the toner (up to a maximum of 100%) ,
// another method to simulate printing a page (which should increase the number of pages printed)
// Decide on the scope, whether to use constructors and anything else you think is needed