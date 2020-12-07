//package main.java;

public class Nuts extends Condiment_Decorator {

    IceCream iceCream;
    double nutsCost = 0.5;

    public Nuts(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return nutsCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
        return iceCream.getDetails() + ", " + getClass().getSimpleName();
    }
}
