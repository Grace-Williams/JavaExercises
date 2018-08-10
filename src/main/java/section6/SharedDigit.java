package section6;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {

        if (first < 10 || first >= 100 || second < 10 || second >= 100) {
            return false;
        }

        int lastDigitFirst = first % 10;
        int lastDigitSecond = second % 10;

        if (lastDigitFirst != lastDigitSecond) {
            int firstDigitFirst = first / 10;
            int firstDigitSecond = second / 10;

            if (firstDigitFirst != firstDigitSecond) {
                if (lastDigitFirst == firstDigitSecond) {
                    return true;
                } else {
                    return false;
                }
            }
        } return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(-12,34));
    }
}


// Write a method named hasSharedDigit with two parameters of type int
// Each number should be within the range of 10 - 99 (inclusive).
// If one of the numbers is not within the range, the method should return false

// The method should return true if there is a digit that appears in both numbers such as 2 in 12 and 23,
// otherwise, the method should return false

// Example input/output
// hasSharedDigit(12,23); should return true since the digit 2 appears in both numbers
// hasSharedDigit(9, 99); should return false since 9 is not within the range of 10-99
// hasSharedDigit(15,55); should return true since 5 appears in both numbers

// NOTE: the hasSharedDigit method should be defined as public static
// Do not add a main