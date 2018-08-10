package section6;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third){

        if ((first < 10 || first >1000) || (second < 10 || second >1000) || (third < 10 || third >1000)){
            return false;
        }

        int lastDigitFirst = first % 10;
        int lastDigitSecond = second % 10;

        if (lastDigitFirst != lastDigitSecond){
            int lastDigitThird = third % 10;

            if (lastDigitFirst != lastDigitThird){
                if (lastDigitSecond == lastDigitThird){
                    return true;
                }
                return false;
            }
            return true;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
}

// Write a method named hasSameLastDigit with three parameters of type int
// Each number should be within the range of 10-1000(inclusive).
// If one of the numbers is not within the range, the method should return false

// The method should return true if at least two of the numbers share the same rightmost digit, otherwise, return false

// Example input/output
// hasSameLastDigit(41,22,71); should return true since 1 is the rightmost digit in numbers 41 and 71
// hasSameLastDigit(23,32,42); should return true since 2 is the rightmost digit in numbers 32 and 42
// hasSameLastDigit(9, 99, 999); should return false since 9 is not within the range 10-1000

// NOTE: The hasSameLastDigit method should be defined as public static
// Do not add a main method
