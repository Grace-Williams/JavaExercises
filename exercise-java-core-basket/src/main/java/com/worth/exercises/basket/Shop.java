package com.worth.exercises.basket;

public class Shop {
    public static void main(String [] args) {
        Basket basket = new Basket();
        basket.setBananas(10);
        basket.setOranges(10);
        basket.setApples(8);
        basket.setPeppers(5);
        basket.setCourgettes(1);
        basket.setKilosOfCarrots(0);
        System.out.println("Basket Price : " + String.format("%.2f", new Checkout().calculatePrice(basket)));
    }
}
