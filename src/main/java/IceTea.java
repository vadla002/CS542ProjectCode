//package main.java;

public class IceTea extends ColdBeverage{

    double iceTeaCost = 1.25;

    @Override
    public double getCost() {
        return iceTeaCost;
    }

    @Override
    public String getDetails() {
        return "IceTea";
    }
}
