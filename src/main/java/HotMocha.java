//package main.java;

public class HotMocha extends HotBeverage{

    double cost =4.75;
    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDetails() {
        return "HotMocha";
    }

    @Override
    public void brewBeverage() {
        System.out.println("Dripping coffee through filter");
    }
}
