package worthExercises.basket;

public class Shop {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.setBananas(2);
        System.out.println("Basket Price : " + String.format("%.2f", new Checkout().calculatePrice(basket)));
    }
}


// Goal:
// The shopping basket contains an order for apples (25p), bananas (18p) , oranges (35p),
// carrots (65p per kilo), courgettes (20p) and peppers (55p).
//
// Current deals are 3 for 2 on peppers. 30% off apples when you buy more than 3 apples,
// 50% off apples when you buy more than 7 apples. Get a free courgette if you buy more than 5 fruit.
// Get a free kilo of carrots for every 4 items of fruit bought.
//
// Implement the method Checkout.calculatePrice() to return the correct price of the basket.