public class LeftCommand implements ICommand {
    private Car mCar;

    public LeftCommand(Car car) {
        mCar = car;
    }

    @Override
    public void execute() {
        mCar.left();
    }
}