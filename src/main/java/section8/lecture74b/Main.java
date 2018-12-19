package section8.lecture74b;

public class Main {

    public static void main(String[] args) {
        Meat meat = new Meat("Angus beef", 4.0);
        RollType rollType = new RollType("Brioche bun");

        Hamburger hamburger = new Hamburger("Hamburger", rollType, meat, 5.0);
        hamburger.getTotalAdditionsPrice("egg");
        hamburger.getTotalAdditionsPrice("bacon");
        hamburger.getTotalAdditionsPrice("lettuce");
        hamburger.getTotalAdditionsPrice("cheese");
        hamburger.getTotalAdditionsPrice("bacon");
        System.out.println(hamburger.getName() + " - " + hamburger.getMeat().getType() + " in " + hamburger.getRollType().getType()) ;
        System.out.println("Each burger costs £" + hamburger.getBurgerPrice());
        System.out.println("The total price for the hamburger is £" + hamburger.totalPrice());

        System.out.println("********************");

        RollType healthyRoll = new RollType("Brown Rye bread");
        Meat veggieMeat = new Meat("Quorn", 6.0);

        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger", healthyRoll, veggieMeat, hamburger.totalPrice());
        healthyBurger.getTotalAdditionsPrice("avocado");
        healthyBurger.getTotalAdditionsPrice("tomato");
        healthyBurger.getTotalAdditionsPrice("cheese");
        System.out.println(healthyBurger.getName() + " - " + healthyBurger.getMeat().getType() + " in " + healthyBurger.getRollType().getType());
        System.out.println("Each healthy burger costs: £" + healthyBurger.getBurgerPrice());
        System.out.println("The total price for the Healthy burger is £" + healthyBurger.totalPrice());

        System.out.println("********************");

        Deluxe deluxe = new Deluxe("Deluxe burger", rollType, meat, hamburger.getBurgerPrice());
        deluxe.getTotalAdditionsPrice("drink");
        deluxe.getTotalAdditionsPrice("cheese");
        deluxe.getTotalAdditionsPrice("chips");
        deluxe.getTotalAdditionsPrice("drink");

        System.out.println("The total price for this burger is £" + deluxe.totalPrice());

    }

}
// MapProgram, Hamburger, RollType, Meat, HealthyBurger, DeluxeBurger
// The purpose of the application is to help a fictitious company called Bill Burgers
// to manage their process of selling hamburgers
// Our application will help Bill to select types of burgers, some of the additional items (additions)
// to be added to the burgers and pricing
// We want to create a base hamburger, but also 2 other types of hamburgers that are popular ones in Bills store
// The basic hamburger should have the following items
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that the
// customer can select to be added to the burger
// Each one of these items gets charged an additional price so you need some way
// to track how many items got added and to calculate the final price (base burger with all the additions)
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above)

// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you can use a setter
// Also create 2 extra varieties of Hamburgers (subclasses) to cater for
// a. Healthy burger - (on a brown rye bread roll), plus 2 addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.  HINT: You probably want to process
// the 2 additional items in this class (subclass of Hamburger), not the base class (Hamburger) since
// the 2 additions are only appropriate for this new class (in other words new burger type)
// b. Deluxe hamburger - comes with chips and drinks as additions but no extra additions are allowed
// HINT: You have to find a way to automatically add these new additions at the time the deluxe burger object
// is created and the prevent other additions being made

// All 3 classes should have a method that can be called anytime to show the base price of the hamburger plus all additions,
// each showing the addition name, and addition price, and a grand/final total for the burger (base price + all additions)
// For the 2 additional classes this may require you to be looking at the base class for pricing and then adding totals to final price
