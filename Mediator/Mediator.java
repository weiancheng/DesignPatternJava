public class Mediator {
    private Account mAccount;
    private Password mPassword;
    private Notification mNotification;

    public Mediator(Account account, Password password, Notification notification) {
        mAccount = account;
        mPassword = password;
        mNotification = notification;
    }

    public boolean login() {
        String account = mAccount.getAccount();
        String password = mPassword.getPassword();

        if (account.length() == 0) {
            mNotification.showFail("[Mediator] Please input your account");
            return false;
        }

        if (password.length() == 0) {
            mNotification.showFail("[Mediator] Please input your password");
            return false;
        }

        mNotification.showSuccess("[Mediator] login success");

        return true;
    }

    public void clean() {
        mAccount.clean();
        mPassword.clean();
    }
}