public class Calculator {
    private Math mMath;

    public Calculator(Math math) {
        // default algorithm
        mMath = math;
    }

    public void setCalculator(Math math) {
        mMath = math;
    }

    public int calculate(int a, int b) {
        return mMath.calculate(a, b);
    }
}
