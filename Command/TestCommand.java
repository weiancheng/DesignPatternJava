public class TestCommand {
    public static void main(String[] args) {
        System.out.println("This is Command Pattern");

        Car car = new Car();
        ICommand forward = new ForwardCommand(car);
        ICommand back = new BackCommand(car);
        ICommand right = new RightCommand(car);
        ICommand left = new LeftCommand(car);
        CarController controller = new CarController();
        controller.setCommand(forward, CarController.ECOMMAND.FORWARD);
        controller.setCommand(back, CarController.ECOMMAND.BACK);
        controller.setCommand(right, CarController.ECOMMAND.RIGHT);
        controller.setCommand(left, CarController.ECOMMAND.LEFT);

        controller.execute(CarController.ECOMMAND.FORWARD);
        controller.execute(CarController.ECOMMAND.RIGHT);
        controller.execute(CarController.ECOMMAND.LEFT);
        controller.execute(CarController.ECOMMAND.BACK);
    }
}