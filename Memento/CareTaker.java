import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mMememtoList;

    public CareTaker() {
        mMememtoList = new Stack<Memento>();
    }

    public int getCount() {
        return mMememtoList.size();
    }

    public void saveState(Memento state) {
        mMememtoList.push(state);
    }

    public Memento getState() {
        return mMememtoList.pop();
    }
}