package com.worth.exercises.basket;

public class Checkout {

    private Basket basket;

    public double calculatePrice(Basket basket) {
        this.basket = basket;

        if (basket != null) {
            double total = (calculateBananaPrice() +
                    calculateOrangePrice() +
                    calculateApplePrice() +
                    calculatePepperPrice() +
                    calculateCarrotPrice() +
                    calculateCourgettePrice());

            // Fruits: apples, bananas, oranges, peppers    Vegetables: courgettes, carrots
            // Free courgette if fruits are more than 5
            if ((basket.getBananas() + basket.getOranges() + basket.getApples() + basket.getPeppers()) >= 5) {
                System.out.println("You got yourself a free courgette!");
                if (basket.getCourgettes() != 0) {
                    total -= .20;
                }
            }

            // Free kilo/s of carrots for every 4 fruits
            if ((basket.getBananas() != 0) && (basket.getOranges() != 0) && (basket.getApples() != 0) && (basket.getPeppers() != 0)) {

                int fruits = basket.getBananas() + basket.getOranges() + basket.getApples() + basket.getPeppers();
                int freeCarrots = fruits / 4;
                double carrotDiscount = freeCarrots * .65;

                System.out.println("Free " + freeCarrots + " kilos of carrots!");

                if (basket.getKilosOfCarrots() != 0) {
                    if (basket.getKilosOfCarrots() > freeCarrots) {
                        total -= carrotDiscount;
                    }
                    total -= calculateCarrotPrice(); // if only 1 kilo of carrots bought (included on the basket)
                }                                    // and they are entitled to 4 kilos free, only the price of
                                                     // the 1 kilo will be deducted to the total amount as
            }                                       // the other 3 will be given without deducting from the total amount
            return total;
        }

        return 0;
    }

    public double calculateBananaPrice() {
        return basket.getBananas() * .18;
    }

    public double calculateOrangePrice() {
        return basket.getOranges() * .35;
    }

    public double calculateApplePrice() {

        int numberOfApples = basket.getApples();
        double priceOfApple = numberOfApples * .25;

        if (numberOfApples > 3 && numberOfApples <= 7) {
            return priceOfApple - (priceOfApple * .30);
        } else if (numberOfApples > 7) {
            return priceOfApple - (priceOfApple * .50);
        }
        return priceOfApple;
    }

    public double calculateCarrotPrice() {
        return basket.getKilosOfCarrots() * .65;
    }

    public double calculateCourgettePrice() {
        return basket.getCourgettes() * .20;
    }

    public double calculatePepperPrice() {

        int numberOfPeppers = basket.getPeppers();

        if (numberOfPeppers >= 3) {
            int remaining = numberOfPeppers % 3;
            int threeForTwo = (numberOfPeppers / 3) * 2;
            return (threeForTwo + remaining) * .55;
        }
        return basket.getPeppers() * .55;
    }
}

// Goal:
// The shopping basket contains an order for apples (25p), bananas (18p) , oranges (35p), carrots (65p per kilo),
// courgettes (20p) and peppers (55p).
//
// Current deals are 3 for 2 on peppers. 30% off apples when you buy more than 3 apples,
// 50% off apples when you buy more than 7 apples. Get a free courgette if you buy more than 5 fruit.
// Get a free kilo of carrots for every 4 items of fruit bought.
//
// Implement the method Checkout.calculatePrice() to return the correct price of the basket.