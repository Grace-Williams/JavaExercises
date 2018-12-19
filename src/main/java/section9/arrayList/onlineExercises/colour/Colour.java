package section9.arrayList.onlineExercises.colour;

import java.util.ArrayList;
import java.util.Collections;

public class Colour {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<String>();
        colours.add("red");
        colours.add("green");
        colours.add("blue");

        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        System.out.println("1.");
        System.out.println(colours);


        System.out.println("------------------------");
        System.out.println("2.");
        // 2. Write a Java program to iterate through all elements in a array list.
        for (String x: colours)
        System.out.println(x);


        System.out.println("------------------------");
        System.out.println("3.");
        // 3. Write a Java program to insert an element into the array list at the first position.
        colours.add(0, "yellow");
        for (String y: colours)
        System.out.println(y);


        System.out.println("------------------------");
        System.out.println("4.");
        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(colours.get(2));


        System.out.println("------------------------");
        System.out.println("5.");
        // 5. Write a Java program to update specific array element by given element.
        colours.set(3, "black");
        for (String b : colours)
            System.out.println(b);


        System.out.println("------------------------");
        System.out.println("6.");
        // 6. Write a Java program to remove the third element from a array list.
        colours.remove(2);
        System.out.println(colours);


        System.out.println("------------------------");
        System.out.println("7.");
        // 7. Write a Java program to search an element in a array list.
        if (colours.contains("red")){
            System.out.println("Red is found");
        } else {
            System.out.println("Red is not on the list.");
        }


        System.out.println("------------------------");
        System.out.println("8.");
        // 8. Write a Java program to sort a given array list.
        Collections.sort(colours);
        System.out.println(colours);


        System.out.println("------------------------");
        System.out.println("9.");
        //9. Write a Java program to copy one array list into another.
        ArrayList<String> colours2 = new ArrayList<String>();
        colours2.add("pink");
        colours2.add("white");
        colours2.add("purple");
        colours2.add("silver");
        System.out.println(colours2);

        Collections.copy(colours2, colours);
        System.out.println("First list: " + colours);
        System.out.println("Second list: " + colours2);





    }
}


// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
// 2. Write a Java program to iterate through all elements in a array list.
// 3. Write a Java program to insert an element into the array list at the first position.
// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
// 5. Write a Java program to update specific array element by given element.
// 6. Write a Java program to remove the third element from a array list.
// 7. Write a Java program to search an element in a array list.
// 8. Write a Java program to sort a given array list.











