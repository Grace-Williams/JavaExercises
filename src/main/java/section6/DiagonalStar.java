package section6;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if (row == 1 || column == 1 || row == number || column == number) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (row == ((number - column) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(2);
    }
}

// Write a method named printSquareStar with one parameter of type int named number

// if the number is < 5, the method should print "Invalid Value"

// The method should print diagonals to generate a rectangular pattern composed of stars (*).
// This should be accomplished by using loops (see examples below)

// Example input/output
// Example 1: printSquareStar(5); should print the following:
//  *****
//  ** **
//  * * *
//  ** **
//  *****
// Explanation:
//   - 5 stars
//   - 2 stars space 2 stars
//   - 1 star space 1 star space 1 star
//   - 2 stars space 2 stars
//   - 5 stars

// Example 2: printSquareStar(8); should print the following:
//  ********
//  **    **
//  * *  * *
//  *  **  *
//  *  **  *
//  * *  * *
//  **    **
//  ********

// The patters above consist of a number of row and columns (where number is the number of rows to print).
// For each row or column, stars are printed based on four conditions (Read them carefully):
// - in the first or last row
// - in the first or last column
// - when the row number equals to the column number
// - when the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

// HINT: Use a nested loop (a loop inside a loop)
// To print on the same line, use the print method instead of println
// To move to another line, you can use an empty method println call

// NOTE: the method should be defined as public static
// Do not add a main method
