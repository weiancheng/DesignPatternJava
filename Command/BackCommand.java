public class BackCommand implements ICommand {
    private Car mCar;

    public BackCommand(Car car) {
        mCar = car;
    }

    @Override
    public void execute() {
        mCar.back();
    }
}