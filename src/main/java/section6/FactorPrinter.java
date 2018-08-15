package section6;

public class FactorPrinter {

    public static void printFactors(int number) {

        if (number >= 1) {
            findFactor(number);
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void findFactor(int number2){
        int factor = 0;

        while (factor <= number2){
            factor++;
            if(number2 % factor == 0){
                System.out.println(factor);
            }
        }
    }

    public static void main(String[] args) {
        printFactors(10);
    }

}

// Write a method named printFactors with one parameter of type int named number
// If number is <1, the method should print "Invalid Value"
// The method should print all factors of the number. A factor of a number is an integer
// which divides that number wholly (ie without leaving a remainder)
// For example 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6/3 =2

// Example input/output:
// printFactors(6); should print 1 2 3 6
// printFactors(32); should print 1 2 4 8 16 32
// printFactors(10); should print 1 2 5 10
// printFactors(-1); should print "Invalid Value" since number is < 1

// HINT: Use a while or for loop

// NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space
// For example, the printout for PrintFactors(10) ; can be
// 1
// 2
// 5
// 10

// NOTE: The printFactors method should be defined as public static
// Do not add a main method


