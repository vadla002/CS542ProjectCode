//package main.java;

public class Cherry extends Fruit_Decorator {

	IceCream iceCream;
	double cherryCost = 1.0;

	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public double getCost() {
		return cherryCost + iceCream.getCost();
	}

	@Override
	public String getDetails() {
		return iceCream.getDetails() + ", " + getClass().getSimpleName();
	}
}