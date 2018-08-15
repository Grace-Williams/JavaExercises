package section6;

public class Lecture45_EvenNumberChallenge {

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void printAllEvenNumbers(int start, int end) {
        int count = 0;

            do {
                if (isEvenNumber(start)) {
                    System.out.println("Number " + start + " is a prime number.");
                    count++;
                }
                start++;
            } while (count < 5);
        }

    public static void main(String[] args) {
        printAllEvenNumbers(1, 20);
    }
}

// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is an even number or not
// return true if an even number, otherwise return false

// Make it record the total number of even numbers it has found and break once 5 even numbers are found
// and at the end, display the even numbers found

