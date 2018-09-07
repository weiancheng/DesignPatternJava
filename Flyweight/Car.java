public class Car implements Vehicle {
    @Override
    public void goForward() {
        System.out.println("Car goes forward");
    }

    @Override
    public void goBack() {
        System.out.println("Car goes back");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turns right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turns left");
    }
}