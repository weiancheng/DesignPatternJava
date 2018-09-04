public class TestFacade {
    public static void main(String[] args) {
        System.out.println("This is Facade Pattern");

        SmartHouse house = new SmartHouse();

        System.out.println("I go to the office...");
        house.leaveHome();

        System.out.println("I'm home...");
        house.arriveHome();

        System.out.println("go to sleep...");
        house.turnSleepMode();
    }
}