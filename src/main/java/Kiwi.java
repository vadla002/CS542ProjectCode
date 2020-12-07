//package main.java;

public class Kiwi extends Fruit_Decorator {

    IceCream iceCream;
    double kiwiCost = 1.0;

    public Kiwi(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return kiwiCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
        return iceCream.getDetails() + ", " + getClass().getSimpleName();
    }
}