public class BananaFactory implements IFactory {
    public BananaFactory() {
    }

    @Override
    public Fruit create() {
        return new Banana();
    }
}