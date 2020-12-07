//package main.java;
public class Chef {

    public static String iceCreamType="";
    public static String beverageType="";
    public static String[] chocolateList = null;
    public static String[] fruitList = null;
    public static String[] condimentList = null;
    public static String flavor = "";
    public static int scoops = 0;
    IceCream iceCream;
    BeverageIF beverage;

    public void getOrder(String factoryType){

        if(factoryType.equalsIgnoreCase("IceCream")){
            System.out.println(iceCreamType + " order received.");

            IceCream_Factory factory =  new IceCream_Factory();
            iceCream = factory.makeIceCream(iceCreamType);

            iceCream.scoops(scoops);
            iceCream.flavors(flavor);
            iceCream = decorate(chocolateList, fruitList, condimentList);

            System.out.println(iceCream.getDetails() + " order completed.");
            System.out.println("Cost: $" + iceCream.getCost());

        }
        else if(factoryType.equalsIgnoreCase("Beverage")){
            System.out.println(beverageType + " order received.");

            Beverage_Factory factory = new Beverage_Factory();
            beverage = factory.makeBeverage(beverageType);
            beverage.prepareBeverage();

            System.out.println(beverage.getDetails() + " order completed.");
            System.out.println("Cost: $" + beverage.getCost());
        }
        System.out.println("");
    }

    public IceCream decorate(String[] chocoList, String[] fruitList, String[] condimentList){
        for (String choco : chocoList) {
            switch (choco) {
                case "WhiteChocolate":
                    iceCream = new WhiteChocolate(iceCream);
                    break;
                case "DarkChocolate":
                    iceCream = new DarkChocolate(iceCream);
                    break;
            }
        }

        for (String fruit : fruitList) {
            switch (fruit) {
                case "Cherry":
                    iceCream = new Cherry(iceCream);
                    break;
                case "DragonFruit":
                    iceCream = new DragonFruit(iceCream);
                    break;
                case "Kiwi":
                    iceCream = new Kiwi(iceCream);
                    break;
            }
        }

        for (String condiment : condimentList) {
            switch (condiment) {
                case "Jellies":
                    iceCream = new Jellies(iceCream);
                    break;
                case "Nuts":
                    iceCream = new Nuts(iceCream);
                    break;
                case "Sprinkles":
                    iceCream = new Sprinkles(iceCream);
                    break;
            }
        }
        return iceCream;
    }
}
