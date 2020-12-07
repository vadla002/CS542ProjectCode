//package main.java;

public class GoldSpot extends ColdBeverage{

    double goldspotCost = 1.5;
    @Override
    public double getCost() {
        return goldspotCost;
    }

    @Override
    public String getDetails() {
        return "GoldSpot";
    }
}