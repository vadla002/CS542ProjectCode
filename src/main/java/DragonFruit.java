//package main.java;

public class DragonFruit extends Fruit_Decorator {

    IceCream iceCream;
    double dragonFruitCost = 1.0;

    public DragonFruit(IceCream iceCream) {
    this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
    return dragonFruitCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
    return iceCream.getDetails() + ", " + getClass().getSimpleName();
    }
}
