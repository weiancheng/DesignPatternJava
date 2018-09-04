public class TestFactory {
    public static void main(String[] args) {
        System.out.println("This is Factory Pattern");

        IFactory factory = new BananaFactory();
        Fruit fruit = factory.create();
    }
}