import java.util.ArrayList;

public class RentCarStore {
    private ArrayList<Vehicle> mGarage = new ArrayList<Vehicle>();

    public RentCarStore(int carInGarage) {
        for (int i = 0 ; i < carInGarage ; i++) {
            mGarage.add(new Car());
        }
    }

    public int getAvalibleCarCount() {
        return mGarage.size();
    }

    public Vehicle getCar() {
        if (mGarage.size() == 0) {
            return null;
        }

        Vehicle vehicle = mGarage.get(0);
        mGarage.remove(vehicle);
        return vehicle;
    }

    public void returnCar(Vehicle car) {
        mGarage.add(car);
    }
}