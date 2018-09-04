public class SmartHouse {
    private ILight mLight;
    private IDoor mDoor;
    private IAirCondition mAirCondition;

    public SmartHouse() {
        mLight = new Light();
        mDoor = new Door();
        mAirCondition = new AirCondition();
    }

    public void leaveHome() {
        mLight.off();
        mDoor.lock();
        mAirCondition.turnOff();
    }

    public void arriveHome() {
        mLight.on();
        mDoor.unlock();
        mAirCondition.turnCold();
    }

    public void turnSleepMode() {
        mLight.off();
        mDoor.lock();
        mAirCondition.turnComfortable();
    }
}