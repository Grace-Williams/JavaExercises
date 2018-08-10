package section5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        int difference = (int)((firstNumber * 1000) - (secondNumber * 1000));
        if (difference != 0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

}

// Write a method areEqualByThreeDecimalPlaces with two parameters of type double
// The method should return boolean and it needs to return true if two double numbers are the same up to 3 decimal places. Otherwise return false

// Examples of input/output:
// - areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since numbers are equal up to 3 decimal places
// - areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers are not equal up to 3 decimal places
// - areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers are equal up to 3 decimal places

// NOTE: The areEqualByThreeDecimalPlaces method needs to be define as public static
// NOTE: Do not add main method