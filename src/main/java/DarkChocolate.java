//package main.java;

public class DarkChocolate  extends Chocolate_Decorator{

    IceCream iceCream;
    double darkChocolateCost = 1.25;

    public DarkChocolate(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return darkChocolateCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
        return iceCream.getDetails() + ", " + getClass().getSimpleName();
    }
}