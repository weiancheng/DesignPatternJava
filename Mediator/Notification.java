public class Notification {
    private Mediator mMediator;

    public Notification() {
    }

    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    public void showSuccess(String msg) {
        System.out.println("Message: " + msg);
    }

    public void showFail(String msg) {
        System.out.println("Error: " + msg);
    }
}