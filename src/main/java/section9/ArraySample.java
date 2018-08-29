package section9;

public class ArraySample {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];

        for(int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for(int e=0; e<array.length; e++){
            System.out.println("Element " + e + ", value is " + array[e]);
        }
    }
}
