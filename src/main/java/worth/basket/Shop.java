package worth.basket;

public class Shop {
    public static void main(String [] args) {
        Basket basket = new Basket();
        basket.setBananas(2);
        basket.setOranges(2);
        basket.setApples(5);
        basket.setPeppers(10);
        basket.setCourgettes(2);
        basket.setKilosOfCarrots(2);
        System.out.println("Basket Price : " + String.format("%.2f", new Checkout().calculatePrice(basket)));
    }
}
