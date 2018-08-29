package section9;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: ");

        for(int i=0; i< array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int a=0; a < array.length; a++){
            System.out.println("Element " + a + " contents " + array[a]);
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int s=0; s<array.length; s++){
//            sortedArray[s] = array[s];
//        }
// Or the below is a shortcut to do the above commented code with the use of Arrays.copyOf()
    int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for(int k=0; k <sortedArray.length -1; k++){
                if(sortedArray[k] < sortedArray[k+1]){
                    temp=sortedArray[k];
                    sortedArray[k] = sortedArray[k+1];
                    sortedArray[k+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.