//package main.java;
public class Beverage_Order implements CommandIF{
    Chef chef;
    String takeOrder;

    public Beverage_Order(Chef chef, String order){
        this.chef = chef;
        this.takeOrder = order;
    }

    @Override
    public void getOrderUp()
    {
        Chef.beverageType = takeOrder;
        chef.getOrder("Beverage");
    }
}
