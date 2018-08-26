public class TurboDecorator implements ICar {
    private ICar mCar;

    public TurboDecorator(ICar car) {
        mCar = car;
    }

    @Override
    public void forward() {
        System.out.println("Turbo power forward");
        mCar.forward();
    }

    @Override
    public void back() {
        System.out.println("Turbo power back");
        mCar.back();
    }

    @Override
    public void left() {
        System.out.println("Turbo power left");
        mCar.left();
    }

    @Override
    public void right() {
        System.out.println("Turbo power right");
        mCar.right();
    }
}