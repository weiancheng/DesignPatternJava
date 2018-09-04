public class TestAbstractFactory {
    public static void main(String[] args) {
        System.out.println("This is Abstract Factory Pattern");
        FruitStore store = new FruitStore();
        Fruit fruit = store.create(FruitStore.BANANA);
    }
}