public class TestIterator {
    public static void main(String[] args) {
        System.out.println("This is Iterator Pattern");
        Request r1 = new Request("request 1");
        Request r2 = new Request("request 2");
        Request r3 = new Request("request 3");

        RequestQueue queue = new RequestQueue();
        queue.add(r3);
        queue.add(r2);
        queue.add(r1);

        Iterator it = queue.getIterator();
        while (it.hasNext()) {
            Request r = (Request) it.next();
            r.doRequest();
        }
    }
}