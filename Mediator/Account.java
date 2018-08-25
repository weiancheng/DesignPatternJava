public class Account {
    private Mediator mMediator;
    private String mAccount = "";

    public Account() {
    }

    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    public void input(String account) {
        mAccount = account;
    }

    public void clean() {
        mAccount = "";
    }

    public String getAccount() {
        return mAccount;
    }
}