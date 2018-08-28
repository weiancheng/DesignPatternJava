public class TestChainOfResponsibility {
    public static void main(String [] arg) {
        System.out.println("This is Chain Of Responsibility Pattern");

        ILogger info = new InfoLogger();
        ILogger warning = new WarningLogger();
        ILogger error = new ErrorLogger();

        info.setNextLogger(warning).setNextLogger(error);

        info.log(ILogger.ELEVEL.ERROR, "can't connect to the Internet");
    }
}