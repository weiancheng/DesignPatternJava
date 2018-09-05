public class Car implements Vehicle {
    private int mHorsePower;
    private int mMaxSpeed;
    private int mWeight;

    public Car(int horsepower, int maxspeed, int weight) {
        mHorsePower = horsepower;
        mMaxSpeed = maxspeed;
        mWeight = weight;
    }

    public void show() {
        System.out.println("Horse Power: " + mHorsePower + ", Max Speed: " + mMaxSpeed + ", Weight: " + mWeight);
    }

    @Override
    public Vehicle clone() {
        return new Car(mHorsePower, mMaxSpeed, mWeight);
    }
}