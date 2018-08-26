public class Car implements ICar {
    public Car() {
    }

    @Override
    public void forward() {
        System.out.println("car forward");
    }

    @Override
    public void back() {
        System.out.println("car back");
    }

    @Override
    public void left() {
        System.out.println("car turns left");
    }

    @Override
    public void right() {
        System.out.println("car turns right");
    }
}