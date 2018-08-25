public class Password {
    private Mediator mMediator;
    private String mPassword = "";

    public Password() {
    }

    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    public void input(String password) {
        mPassword = password;
    }

    public void clean() {
        mPassword = "";
    }

    public String getPassword() {
        return mPassword;
    }
}
