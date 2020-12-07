//package main.java;

public class Cup_IceCream extends IceCream{

    String details;

    public Cup_IceCream() {
        details = "Cup_IceCream";

    }

    @Override
    public double getCost() {
        return 5.00;
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
