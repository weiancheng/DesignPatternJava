public class TestMediator {
    public static void main(String [] arg) {
        LoginButton login_btn = new LoginButton();
        Account account_textview = new Account();
        Password password_textview = new Password();
        Notification notification = new Notification();

        Mediator mediator = new Mediator(account_textview, password_textview, notification);
        account_textview.setMediator(mediator);
        password_textview.setMediator(mediator);
        notification.setMediator(mediator);
        login_btn.setMediator(mediator);

        account_textview.input("weian");
        password_textview.input("123454");
        login_btn.clickLogin();
        login_btn.clickClean();
    }
}