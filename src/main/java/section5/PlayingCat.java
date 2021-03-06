package section5;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int limit = 35;

        if (summer) {
            limit = 45;
        }

        return (temperature >= 25 && temperature <= limit);
    }

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 36));
    }
}


// The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive).
// Unless it is summer, then the upper limit is 45(inclusive) instead of 35

// Write a method isCatPlaying that has 2 parameters. Method needs to return true is cat is playing, otherwise return false
// 1st parameter should be of type boolean and be named summer it represents if it is summer.
// 2nd parameter represents the temperature and is of type int with the name temperature

// examples of input/output:
// isCatPlaying(true, 10); should return false since temperature is not in range 25-45
// isCatPlaying(false, 36); should return false since temperature is not in range 25-35 (summer parameter is false)
// isCatPlaying(false, 35); should return true since temperature is not in range 25-35

// NOTE:  The isCatPlaying method needs to be defined as public static
// Do not add main method

