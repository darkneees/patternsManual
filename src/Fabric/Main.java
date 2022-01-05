package Fabric;

public class Main {

    public static void main(String[] args) {
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(coffeeFactory);
        coffeeShop.orderCoffee(CoffeeType.AMERICANO);
    }
}
