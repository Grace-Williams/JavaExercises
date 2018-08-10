package section6;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int quotient = 1;

        if (first < 10 || second < 10) {
            return -1;
        }

        if (first > second) {
            int dividend = first;
            int divisor = second;

            int remainder = dividend % divisor;

            if (remainder == 0) {
                quotient = divisor;
                return quotient;
            }

            while (remainder != 0){

                if (divisor % remainder == 0) {
                    quotient = remainder;
                    break;
                } else {
                    int left = divisor % remainder;
                    quotient = left;
                    break;
                }
            }
        }

        if (second > first) {
            int dividend = second;
            int divisor = first;

            int remainder = dividend % divisor;

            if (remainder == 0) {
                quotient = divisor;
                return quotient;
            }

            while (remainder != 0){

                if (divisor % remainder == 0) {
                    quotient = remainder;
                    break;
                } else {
                    int left = divisor % remainder;
                    quotient = left;
                    break;
                }
            }
        }

        return quotient;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

}


// Write a method named getGreatestCommonDivisor with two parameters of type int named first and second
// If one of the parameters is less than 10, the method should return -1 to indicate an invalid value

// The method should return the greatest common divisor of the two numbers (int)
// The greatest common divisor is the largest positive integer that can fully
// divide each of the integers (without leaving a remainder)

// For example 12 and 30:
// - 12 can be divided by 1, 2, 3, 4, 6, 12
// - 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
// The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder

// Example input/ output
// getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
// getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
// getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is less than 10
// getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder

// HINT: Use a while or a for loop and check if both numbers can be divided without a remainder
// Find the minimum of the two numbers
// NOTE: The getGreatestCommonDivisor method should be defined as public static
// Do not add a main method

