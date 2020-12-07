//package main.java;

public abstract class IceCream {

    String details = "";
    public abstract double getCost();

    public String getDetails()
    {
        return details;
    }

    public void scoops(int noOfScoops) {
        System.out.println("Preparing "+ noOfScoops);
    }


    public void flavors(String flavorType) {
        System.out.println("Preparing " + flavorType);
    }
}
