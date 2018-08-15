package section6;

import java.util.Scanner;

public class Lecture52_MinMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        int min = number;
        int max = number;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int nextNumber = scanner.nextInt();

                if (nextNumber > max) {
                    max = nextNumber;
                }

                if (nextNumber < min) {
                    min = nextNumber;
                }
            } else {
                break;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        scanner.close();
    }
}

// Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
// Before the user enters the number, print the message "Enter number:"
// If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

// Hint:
// Use an endless while loop.

// Bonus:
// Create a project with the name MinAndMaxInputChallenge.
