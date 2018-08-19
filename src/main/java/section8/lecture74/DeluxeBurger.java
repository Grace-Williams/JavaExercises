package section8.lecture74;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(Meat meat, BreadRoll breadRoll, double baseBurgerPrice, Additions additions) {
        super("Deluxe burger", meat, breadRoll, baseBurgerPrice, additions);
    }

    @Override
    public double totalBurgerPrice(){
        double discount = 1.0;
        double totalDeluxePrice = (super.getBaseBurgerPrice()+ super.getAdditions().getAdditionsTotal()) - discount;
        System.out.println("Total burger price + additions and deluxe discount = £" + totalDeluxePrice);
        return totalDeluxePrice;
    }
}
