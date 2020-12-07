//package main.java;

public class Beverage_Factory {

	public BeverageIF makeBeverage(String beverageType) {
		switch (beverageType) {
		case "HotMocha":
			return new HotMocha();
		case "Cappuccino":
			return new Cappuccino();
		case "Coke":
			return new Coke();
		case "GoldSpot":
			return new GoldSpot();
		case "IceTea":
			return new IceTea();
		default:
			return null;
		}
	}
}
