public abstract class CoffeeMachine {
	public CoffeeMachine() {
	}

	public abstract void grindBeans(String bean);

	public abstract void pullWater(int temperature);

	public abstract void pullMilk();

	public abstract void addSugar();

	public abstract void cockCoffee(int second);

	public void makeBlack() {
		grindBeans("Arabica");
		pullWater(100);
		cockCoffee(30);
	}

	public void makeThreeInOne() {
		grindBeans("coffee powder");
		pullWater(90);
		pullMilk();
		addSugar();
		cockCoffee(5);
	}
}