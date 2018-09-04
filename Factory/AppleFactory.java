public class AppleFactory implements IFactory {
    public AppleFactory() {
    }

    @Override
    public Fruit create() {
        return new Apple();
    }
}