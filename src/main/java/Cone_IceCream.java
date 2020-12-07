//package main.java;

public class Cone_IceCream extends IceCream {

    String details;

    public Cone_IceCream() {
        details = "Cone_IceCream";

    }

    @Override
    public double getCost() {
        return 4.00;
    }

    @Override
    public String getDetails() {
        return details;
    }

//    @Override
//    public void scoops(int noOfScoops) {
//
//    }
//
//    @Override
//    public void flavors(String flavorType) {
//
//    }
}