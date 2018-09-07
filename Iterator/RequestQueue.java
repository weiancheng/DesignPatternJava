import java.util.ArrayList;

public class RequestQueue implements Container {
    private ArrayList<Request> mQueue = new ArrayList<Request>();

    public RequestQueue() {
    }

    public void add(Request request) {
        mQueue.add(request);
    }

    public boolean remove(Request request) {
        if (mQueue.contains(request)) {
            mQueue.remove(request);
            return true;
        }
        return false;
    }

    @Override
    public Iterator getIterator() {
        return new RequestIterator();
    }

    private class RequestIterator implements Iterator {
        private int index = 0;
        private int currentSize = 0;

        public RequestIterator() {
            currentSize = mQueue.size();
        }

        @Override
        public boolean hasNext() {
            if (currentSize != mQueue.size())
                return false;

            if (index <= (currentSize - 1))
                return true;

            return false;
        }

        @Override
        public Object next() {
            return mQueue.get(index++);
        }
    }
}