//package main.java;

public class Sprinkles extends Condiment_Decorator {

    IceCream iceCream;
    double sprinklesCost = 0.5;

    public Sprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return sprinklesCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
        return iceCream.getDetails() + ", " + getClass().getSimpleName();
    }
}
