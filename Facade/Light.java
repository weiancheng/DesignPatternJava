public class Light implements ILight {
    public Light() {
    }

    @Override
    public void on() {
        System.out.println("turn on the light");
    }

    @Override
    public void off() {
        System.out.println("turn off the light");
    }
}