public class AirCondition implements IAirCondition {
    public AirCondition() {
    }

    @Override
    public void turnCold() {
        System.out.println("set air condition at the cold temperature");
    }

    @Override
    public void turnComfortable() {
        System.out.println("set air condition at the comfortable temperature");
    }

    @Override
    public void turnOff() {
        System.out.println("turn air condition off");
    }
}