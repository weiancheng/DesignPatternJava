public class TestStrategy {
    public static void main(String [] arg) {
        System.out.println("This is Strategy Pattern");

        Calculator calculator = new Calculator(new Sub());
        System.out.println("2 - 1 is " + calculator.calculate(2, 1));

        calculator.setCalculator(new Mul());
        System.out.println("10 * 5 is " + calculator.calculate(10, 5));
    }
}
