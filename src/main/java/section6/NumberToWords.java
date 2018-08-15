package section6;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        int number1 = reverse(number);
        int remainder;
        do {
            remainder = number1 % 10;
            switch (remainder) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("");
            }
            number1 = number1 / 10;
            count--;

        } while (count > 0);
    }

    public static int reverse(int numberToReverse) {

        int remainder;
        int reverse = 0;

        while (numberToReverse != 0) {
            remainder = numberToReverse % 10;
            reverse = reverse * 10;
            reverse += remainder;
            numberToReverse = numberToReverse / 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number > 0);

        return count;
    }

    public static void main(String[] args) {
        numberToWords(120);

    }
}

// Write a method called numberToWords with one int parameter named number
// The method needs to print out the passed number using words for the digits
// If the number is negative then print "Invalid Value"

// To print the number in words use the following steps
// 1. Extract last digit of given number using the remainder operator
// 2. Switch the value of digit found above.  There are 10 possible values of digits those being 0, 1,2,3,4,5,6,7,8,9
// Print the corresponding word for each digit. eg. print "Zero" if the digit is 0 and so on
// 3. Remove the last digit from the number
// 4. Repeat steps 2 through 4 until the number is 0

// The logic above is correct but the words will be printed in reverse order. For example if the number is 234
// the logic above will produce the output "Four Three Two".
// To overcome this problem write a second method called reverse

// The reverse method has one int parameter and returns the reversed number (int).
// For example if the number passed is 234 then the reversed number returned would be 432

// The reverse method should also reverse negative numbers. Use this reverse method in
// the numberToWords method then print the words in the correct order

// For the number 100 the reverse number is 001.  The logic above for the method numberToWords will print "One"
// but that is incorrect it should print "One Zero Zero"

// To solve the problem with leading zeroes write a third method getDigitCount
// The getDigitCount method has one int parameter number and returns the count of digits in that number
// If the number is negative then return -1 to indicate an invalid value

// If number has the value of 100 then the method getDigitCount needs to return 3 since the number 100 has 3 digits 1,0,0

// Example input/output - getDigitCount method
// getDigitCount(0); should return 1 since there is only 1 digit
// getDigitCount(123); should return 3
// getDigitCount(-12); should return -1 since the parameter is negative
// getDigitCount(5200); should return 4 since there are 4 digits

// Example input/output - reverse method
// reverse(-121); should return -121
// reverse(1212); should return 2121
// reverse(1234); should return 4321
// reverse(100); should return 1

// Example input/output - numbersToWords method
// numbersToWords(123); should print "One Two Three"
// numbersToWords(1010); should return "One Zero One Zero"
// numbersToWords(1000); should print "One Zero Zero Zero"
// numbersToWords(-12); should print "Invalid Value" since the parameter is negative

// HINT: Use a for loop to print zeroes after reversing the number

// e.g. 100 reversed is 1 so needs to print "One Zero Zero". To get the number of zeroes check the difference
// between the digit count from the original number and the reversed number

// NOTE: Methods need to be public static
// In total you have to write 3 methods
// When printing words for example numberToWords(123); Each word can be in its own line, they don't have to be separated by a space
// Do not add a main method
