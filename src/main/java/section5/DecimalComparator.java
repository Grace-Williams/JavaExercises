package section5;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        if((int)(firstNumber * 1000) == (int)(secondNumber * 1000)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
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