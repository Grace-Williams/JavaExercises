package Section5;

public class TeenNumberChecker {

    public static boolean hasTeen(int first, int second, int third){

        int min = 13;
        int max = 19;

        if ((first >= min && first <= max) || (second >= min && second <= max) || (third >= min && third <= max)){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

//    public static void main(String[] args) {
//        hasTeen(22, 23, 12);
//    }
}

// We'll say that a number is teen if it is in the range of 13-19(inclusive)
// Write a method hasTeen with 3 parameters of type int
// The method should return boolean and it needs to return true if one of parameters is in range 13-19(inclusive). Otherwise return false

// Examples of input/output:
// - hasTeen(9, 99, 19); should return true since 19 is in the range
// - hasTeen(23, 15, 42); should return true since 15 is in the range
// - hasTeen(22, 23, 34); should return false since numbers 22, 23, 34 are not in the range

// NOTE: The hasTeen method needs to be defined as public static
// NOTE: Do not add a main method

