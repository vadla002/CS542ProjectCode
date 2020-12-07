//package main.java;
public class Cappuccino extends HotBeverage {

    double cost = 4.25;

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDetails() {
        return "Cappuccino";
    }

    @Override
    public void brewBeverage() {
        System.out.println("Dripping Cappuccino");
    }
}