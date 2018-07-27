package Section6;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        int lastDigit = number % 10;  // this straight away identifies the last digit

        if (number < 0){
            return -1;
        }

        while (number > 9){          // if the number is only one digit, div by 10 is unnecessary
            number = number/10;
        }
        return number + lastDigit;

    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
    }
}

// Write a method named sumFirstAndLastDigit with one parameter of type int called number

// The method needs to find the first and last digit of the parameter number passed to the method, using a loop
// and return the sum of the first and last digit of that number

// If the number is negative then the method needs to return -1 to indicate an invalid value

// Example input/output:
// sumFirstAndLastDigit(252); should return 4, first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4
// sumFirstAndLastDigit(257); should return 9, first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9
// sumFirstAndLastDigit(0); should return 0, first digit is 0 since we only have 1 digit which gives us 0+0 and the sum is 0
// sumFirstAndLastDigit(5); should return 10, first digit and the last is 5 since we only have 1 digit which gives us 5+5 and the sum is 10
// sumFirstAndLastDigit(-5); should return -1, because the parameter is negative and needs to be positive

// NOTE: The sumFirstAndLastDigit method needs to be defined as public static
// Do not add a main method

