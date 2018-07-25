package Section5;

public class EqualSumChecker {

    public static boolean hasEqualSum(int first, int second, int third){

        if (first + second == third){
            return true;
        } else {
            return false;
        }
    }

//    public static void main(String[] args) {
//        boolean hasPrint = hasEqualSum(1, 1, 1);
//        System.out.println(hasPrint);
//    }
}

// Write a method hasEqualSum with 3 parameters of type int.

// The method should return boolean and it needs to return true if sum of first and second parameter is equal to third parameter.
// Otherwise return false.

// Examples of input/output:
// - hasEqualSum(1, 1, 1); should return false since 1 + 1 is not equal to 1
// - hasEqualSum(1, 1, 2): should return true since 1 + 1 is equal to 2
// - hasEqualSum(1, -1, 0); should return true since 1 + (-1) is 1 - 1 and is equal to 0

// NOTE: The hasEqualSum method needs to be defined as public static
// NOTE: Do not add a main method
