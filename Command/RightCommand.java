public class RightCommand implements ICommand {
    private Car mCar;

    public RightCommand(Car car) {
        mCar = car;
    }

    @Override
    public void execute() {
        mCar.right();
    }
}