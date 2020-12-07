//package main.java;

public class WhiteChocolate extends Chocolate_Decorator{

    IceCream iceCream;
    double whiteChocolateCost = 1.5;
//    String detail = "White Chocolate";

    public WhiteChocolate(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return whiteChocolateCost + iceCream.getCost();
    }

    @Override
    public String getDetails() {
        return iceCream.getDetails() +  ", " + getClass().getSimpleName();
    }
}
