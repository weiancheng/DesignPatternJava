public class TestDecorator {
    public static void main(String [] arg) {
        System.out.println("This is Decorator Pattern");

        ICar car = new TurboDecorator(new Car());
        
        car.back();
        car.left();
        car.forward();
        car.right();
    }
}