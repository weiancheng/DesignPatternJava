public class LoginButton {
    private Mediator mMediator;

    public LoginButton() {
    }

    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    public void clickLogin() {
        mMediator.login();
    }

    public void clickClean() {
        mMediator.clean();
    }
}
