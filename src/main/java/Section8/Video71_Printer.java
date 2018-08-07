package Section8;

public class Video71_Printer {

    private int tonerLevel;
    private int pagesToPrint;
    private boolean isDuplexPrinter;

    public Video71_Printer(int tonerLevel, int pagesToPrint, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.isDuplexPrinter = isDuplexPrinter;
        this.pagesToPrint = pagesToPrint;
    }

    public int addToner() {

        int tonerToAdd = 0;

        if (tonerLevel < 100){
            tonerToAdd = 100 - tonerLevel;
        } else {
            System.out.println("No need to add Toner");
        }
        System.out.println("Toner to add: " + tonerToAdd);
        return tonerToAdd;
    }

    public int getPagesToPrint(){

        if (isDuplexPrinter){
            pagesToPrint = (pagesToPrint/2) + (pagesToPrint % 2);
        } else {
            this.pagesToPrint= pagesToPrint;
        }
        System.out.println("The number of pages to be printed is " + pagesToPrint);
        return pagesToPrint;
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