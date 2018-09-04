public class Factory {
    public static final int APPLE = 1;
    public static final int BANANA = 2;
    public static final int WATERMELON = 3;

    public Factory() {
    }

    Fruit create(int fruit) {
        switch (fruit) {
            case APPLE:
                return new Apple();

            case BANANA:
                return new Banana();

            case WATERMELON:
                return new Watermelon();

            default:
                return new Apple();
        }
    }
}