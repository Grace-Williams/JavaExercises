package section6;

public class Lecture41_PrimeNumberChallenge {

    public static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printAllPrime(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        printAllPrime(39, 50);
    }
}

// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// it it is a prime number, print it out AND increment a count of the number of prime numbers found
// if that count is 3 exit the for loop
// HINT: Use the break; statement to exit
