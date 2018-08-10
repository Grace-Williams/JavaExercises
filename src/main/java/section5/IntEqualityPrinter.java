package section5;

public class IntEqualityPrinter {

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber){

        if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0){
            System.out.println("Invalid Value");
        } else if ((firstNumber - secondNumber == 0) && (secondNumber - thirdNumber == 0)){
            System.out.println("All numbers are equal");
        } else if ((firstNumber - secondNumber != 0) && (secondNumber - thirdNumber != 0) && (firstNumber - thirdNumber !=0)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {

        printEqual(1,1,3);
    }
}

// Write a method printEqual with 3 parameters of type int.  The method should not return anything (void)
// If one of parameters is less than 0, print text "Invalid Value"
// If all numbers are equal print text "All numbers are equal"
// If all numbers are different print text "All numbers are different"
// Otherwise print "Neither all are equal or different"

// Examples of input/output:
// printEqual(1,1,1); should print text All numbers are equal
// printEqual(1,1,2); should print text Neither all are equal or different
// printEqual(-1,-1,-1); should print text Invalid Value
// printEqual(1,2,3); should print text All numbers are different

// NOTES: The printEqual method needs to be defined as public static
// Do not add main method

