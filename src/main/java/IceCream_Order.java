//package main.java;

public class IceCream_Order implements CommandIF{

    Chef chef;
    String[] chocolateList, fruitList, condimentList;
    String takeOrder;
    String flavor;
    int scoops;

    public IceCream_Order(Chef chef, String order, String[] chocList, String[] fruitList, String[] condiList, String flavor, int scoops)
    {
        this.chef = chef;
        this.takeOrder = order;
        this.chocolateList = chocList;
        this.fruitList = fruitList;
        this.condimentList = condiList;
        this.flavor = flavor;
        this.scoops = scoops;
    }

    @Override
    public void getOrderUp()
    {
        Chef.iceCreamType = takeOrder;
        Chef.chocolateList = chocolateList;
        Chef.fruitList = fruitList;
        Chef.condimentList = condimentList;
        Chef.flavor = flavor;
        Chef.scoops = scoops;
        chef.getOrder("IceCream");
    }
}
