//package main.java;

public abstract class HotBeverage implements BeverageIF{

    public abstract double getCost();
    public abstract String getDetails();

    @Override
    public void prepareBeverage() {
        brewBeverage();
        serveBeverage();
    }

    public void brewBeverage()
    {
        System.out.println("Preparing the drink");
    }

    public void serveBeverage()
    {
        System.out.println("Serving the drink");
    }
}
