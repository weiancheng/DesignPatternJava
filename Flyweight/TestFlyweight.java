public class TestFlyweight {
    public static void main(String[] args) {
        System.out.println("This is Flyweight Pattern");

        RentCarStore store = new RentCarStore(10);
        Vehicle car = store.getCar();
        System.out.println("Now avaliable car: " + store.getAvalibleCarCount());
        car.goBack();
        car.goForward();
        car.turnLeft();
        car.turnRight();
        store.returnCar(car);
        System.out.println("Now avaliable car: " + store.getAvalibleCarCount());
    }
}