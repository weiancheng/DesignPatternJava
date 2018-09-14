public class Scooter implements Car {
    @Override
    public void start() {
        System.out.println("Scooter engine start");
    }

    @Override
    public void stop() {
        System.out.println("Scooter engine shut down");
    }

    @Override
    public void turnSpeedUp(int speed) {
        System.out.println("Scooter speed up to " + speed + " km/h");
    }

    @Override
    public void turnSpeedDown(int speed) {
        System.out.println("Scooter speed down to " + speed + " km/h");
    }
}