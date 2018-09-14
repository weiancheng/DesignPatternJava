public class MobileCar implements Car {
    @Override
    public void start() {
        System.out.println("Car engine start");
    }

    @Override
    public void stop() {
        System.out.println("Car engine shut down");
    }

    @Override
    public void turnSpeedUp(int speed) {
        System.out.println("Car speed up to " + speed + " km/h");
    }

    @Override
    public void turnSpeedDown(int speed) {
        System.out.println("Car speed down to " + speed + " km/h");
    }
}