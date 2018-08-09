package Section6;

public class PerfectNumber {


    public static boolean isPerfectNumber(int number){

        if (number >= 1){

                if (addDivisors(number) == number) {
                    return true;
                } else {
                return false;
                }

        } else {
            return false;
        }
    }

    public static int addDivisors(int number2){
        int sum = 0;

        for(int divisor = 1; divisor < number2; divisor++){

            if (number2 % divisor == 0) {
                sum += divisor;
            } else {
                continue;
            }
            System.out.println("new divisor " + divisor);
            System.out.println("sum = " + sum);
            System.out.println("*************");
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
}

}

// What is a perfect number? A perfect number is a positive integer which is equal to
// the sum of its proper positive divisors. Proper divisors are positive integers that fully divide
// the perfect number without leaving a remainder and exclude the perfect number itself.
// For example, take the number 6: its proper divisors are 1, 2 and 3 (since 6 is the value of
// the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6
// Therefore, 6 is a perfect number (as well as the first perfect number)

// Write a method named isPerfectNumber with one parameter of type int named number
// If number is < 1, the method should return false
// The method must calculate if the number is perfect.  If the number is perfect, the method should return true,
// otherwise, it should return false

// Example input/output:
// isPerfectNumber(6); should return true since its proper divisors are 1,2,3 and the sum is 1+2+3 = 6
// isPerfectNumber(28); should return true since its proper divisors are 1,2,4,7,14 and the sum is 1+2+4+7+14 = 28
// isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
// isPerfectNumber(-1); should return false since the number is < 1

// HINT: Use a while or for loop
// use the remainder operator

// NOTE: The isPerfectNumber method should be defined as public static
// Do not add a main method



