public class TestSimpleFactory {
    public static void main(String[] args) {
        System.out.println("This is Simple Factory Pattern");
        Factory factory = new Factory();
        Fruit fruit = factory.create(Factory.BANANA);
    }
}