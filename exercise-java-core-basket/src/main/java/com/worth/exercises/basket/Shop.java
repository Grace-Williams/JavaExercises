package com.worth.exercises.basket;

public class Shop {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.setBananas(2);
        System.out.println("Basket Price : " + String.format("%.2f", new Checkout().calculatePrice(basket)));
    }
}
