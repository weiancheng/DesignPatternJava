public class Request {
    private String message;

    public Request(String msg) {
        message = msg;
    }

    public void doRequest() {
        System.out.println(message);
    }
}