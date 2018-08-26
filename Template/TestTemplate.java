public class TestTemplate {
    public static void main(String [] arg) {
        System.out.println("This is Template Pattern");
        CoffeeMachine machine = new NestleMachine();
        machine.makeThreeInOne();
        System.out.println("next...");
        machine.makeBlack();
    }
}