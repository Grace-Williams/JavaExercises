package section6;

public class Palindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;

        int num = number;   // to keep the value of number, it is assigned to new variable num & this is the one to be used on the while statement

        while(num != 0) {   // based on the examples of input/output, this method accepts - numbers, so condition is while num is not equals to zero

            int lastDigit = num % 10;  // as suggested below, this value will not change

            reverse = reverse * 10;  // the increase the place value as suggested below
            reverse += lastDigit;

            num /= 10;   // this is the reason why number is assigned to a different variable
        }

        if(number == reverse){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11711));
    }
}

// Write a method called isPalindrome with one int parameter called number
// The method needs to return a boolean
// it should return true if the number is a palindrome number otherwise it should return false

// Check the tips below for more info about palindromes

// Example input/output:
// - isPalindrome(-1221); should return true
// - isPalindrome(707); should return true
// - isPalindrome(11212); should return false because reverse is 21211 and that is not equal to 11212

// TIP: What is a Palindrome number? it is a number which when reversed is equal to the original number. ex. 121,12321

// TIP: Logic to check a palindrome number:
// Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse
// If both are the same then the number is a palindrome otherwise it is not

// TIP: Logic to reverse a number
// Declare and initialize another variable to store the reverse of a number. for example reverse = 0
// Extract the last digit of the given number by performing modulo division
// Store the last digit to some variable say lastDigit = num % 10
// Increase the place value of reverse by one
// To increase place value multiply reverse variable by 10, e.g. reverse = reverse * 10
// Add lastDigit to reverse
// Since last digit of num is processed, remove last digit of num.  To remove the last digit divide num by 10
// Repeat steps until num is not equal to (or greater than) zero

// A while loop would be good for this exercise
// TIP: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter)
// NOTE: The isPalindrome method needs to be defined as public static
// Do not add a main method


