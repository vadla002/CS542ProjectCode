//package main.java;

public class IceCream_Factory {

    public IceCream makeIceCream(String iceCreamType) {

        switch (iceCreamType) {
            case "Cup IceCream":
                return new Cup_IceCream();
            case "Cone IceCream":
                return new Cone_IceCream();
            default:
                return null;
        }
    }
}
