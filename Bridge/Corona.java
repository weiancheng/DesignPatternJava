public class Corona extends Toyota {
    public Corona(Car car) {
        super(car);
    }

    @Override
    public void on() {
        mCar.start();
    }

    @Override
    public void off() {
        mCar.stop();
    }

    @Override
    public void up(int speed) {
        mCar.turnSpeedUp(speed);
    }

    @Override
    public void down(int speed) {
        mCar.turnSpeedDown(speed);
    }
}