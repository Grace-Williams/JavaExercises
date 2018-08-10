package Section5;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking == true && (hourOfDay < 8 && hourOfDay >=0) || barking == true && (hourOfDay > 22 && hourOfDay == 23)) {
            return true;
        } else if (barking == true && hourOfDay >= 8 || barking == true && hourOfDay <= 22) {
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(bark(true, 1));
    }
}

// We have a dog that likes to bark. We need to wake up if the dog is barking at night!
// Write a method bark that has 2 parameters.
// 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking
// 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has valid range of 0-23
// We have to wake up if the dog is barking before 8:00 am or after 22:00 hours so in the case return true
// In all other cases return false.  If the hourOfDay parameter is less than 0 or greater than 23 return false

// Examples of input/output:
// - bark(true, 1); should return true
// - bark(false, 2); should return false since the dog is not barking
// - bark(true, 8);  should return false since it's not before 8am
// - bark(true, -1); should return false because the hourOfDay parameter needs to be in range 0-23

// TIP: Use an if else statement with multiple conditions
// NOTE: The bark method needs to be defined as public static like we have been doing so far in the course
// NOTE: Do not add a main method to solution code

// I have mentioned that I have expected these lines to work but didn't, I have now realised that
// the condition should not be separated and won't work because of else if statement
// if (barking == true && hourOfDay < 8 || barking == true && hourOfDay > 22) {
//            System.out.println("true");
// } else if (barking == true && hourOfDay >= 0 || barking == true && hourOfDay == 23) {
//     System.out.println("true");