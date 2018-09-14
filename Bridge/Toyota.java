public abstract class Toyota {
    protected Car mCar;
    protected Toyota(Car car) {
        mCar = car;
    }

    public abstract void on();
    public abstract void off();
    public abstract void up(int speed);
    public abstract void down(int speed);
}