package section6;

public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int sum = (bigCount * 5) + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0 || sum < goal) {
            return false;
        }
        int bigPacks = goal / 5;

        return (bigPacks * 5) + smallCount >= goal;
    }

    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));
    }

}

// Write a method name canPack with 3 parameters of type int named bigCount, smallCount and goal
// The parameter bigCount represents the count of big flour bags (5 kilo each)
// The parameter smallCount represents the count of small bags (1 kilo each)
// The parameter goal represents the goal amount of kilos of flour needed to assemble a package

// Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal
// The method should return true if it is possible to make a package with goal kilos of flour

// If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
// For example, if goal=9, bigCount =2, and smallCount =0, the method should return false because
// bigCount bag is 5 kilos and cannot be divided.  However, if goal = 9, bigCount =1, and smallCount =5,
// the method should return true because 1 full bigCount bag and 4 full smallCount bags equal goal,
// and it's okay if there are additional bags left over.

// If any of the parameters are negative, return false

// Example input/output:
// canPack(1,0,4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos
// canPack(1,0,5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos
// canPack(0,5,4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos
// canPack(2,2,12); should return true since bigCount is 2 (big bags 5 kilos each) and
//       smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 12 kilos
// canPack(-3,2,12); should return false since bigCount is negative

// NOTE: The canPack method should be defined as public static
// Do not add main method
