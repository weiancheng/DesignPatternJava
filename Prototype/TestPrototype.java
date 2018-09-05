public class TestPrototype {
    public static void main(String[] args) {
        System.out.println("This is Prototype Pattern");

        Vehicle car = new Car(10, 200, 2);
        Vehicle car_clone = car.clone();
        car_clone.show();
    }
}