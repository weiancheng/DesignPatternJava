public class FruitStore {
    public static final int APPLE = 1;
    public static final int BANANA = 2;
    public static final int WATERMELON = 3;

    public FruitStore() {
    }

    public Fruit create(int fruit) {
        IFactory factory;

        switch (fruit) {
            case APPLE:
                factory = new AppleFactory();
                break;

            case BANANA:
                factory = new BananaFactory();
                break;

            case WATERMELON:
                factory = new WatermelonFactory();
                break;

            default:
                factory = new AppleFactory();
        }

        return factory.create();
    }
}