////package main.java;
public class Coke extends ColdBeverage{

    double colaCost = 2.0;
    @Override
    public double getCost() {
        return colaCost;
    }

    @Override
    public String getDetails() {
        return "Coke";
    }
}
