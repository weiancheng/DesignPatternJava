public class TestBuilder {
    public static void main(String[] args) {
        System.out.println("This is Builder Pattern");

        Architecture arch = new Architecture.Builder().setWidth(100).setFloor(10).setHeight(200).build();
        arch.show();
    }
}