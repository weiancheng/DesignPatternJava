public class TestBridge {
    public static void main(String[] args) {
        System.out.println("This is Bridge Pattern");

        Toyota corona = new Corona(new MobileCar());
        corona.on();
        corona.up(100);
        corona.down(40);
        corona.off();
    }
}