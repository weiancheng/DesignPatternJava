public class NestleMachine extends CoffeeMachine {
	public NestleMachine() {
	}

	@Override
	public void grindBeans(String bean) {
		System.out.println("grind " + bean);
	}

	@Override
	public void pullWater(int temperature) {
		System.out.println("the temperature of water is " + temperature + " Celsius");
	}

	@Override
	public void pullMilk() {
		System.out.println("pull some milk");
	}

	@Override
	public void addSugar() {
		System.out.println("pull some sugar");
	}

	@Override
	public void cockCoffee(int second) {
		System.out.println("cock a cup of coffee for " + second + " seconds");
	}
}