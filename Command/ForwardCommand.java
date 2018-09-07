public class ForwardCommand implements ICommand {
    private Car mCar;

    public ForwardCommand(Car car) {
        mCar = car;
    }

    @Override
    public void execute() {
        mCar.forward();
    }
}