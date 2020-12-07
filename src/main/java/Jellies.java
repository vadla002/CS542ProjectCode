//package main.java;

public class Jellies extends Condiment_Decorator {

    IceCream iceCream;
    double jelliesCost = 0.5;

    public Jellies(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return jelliesCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
        return iceCream.getDetails() + ", " + getClass().getSimpleName();
    }
}
