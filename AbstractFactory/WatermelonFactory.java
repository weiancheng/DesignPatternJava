public class WatermelonFactory implements IFactory {
    public WatermelonFactory() {
    }

    @Override
    public Fruit create() {
        return new Watermelon();
    }
}