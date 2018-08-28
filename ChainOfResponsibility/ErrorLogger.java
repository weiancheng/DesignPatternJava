public class ErrorLogger extends ILogger {
    public ErrorLogger() {
        super();
    }

    @Override
    public void log(ILogger.ELEVEL level, String msg) {
        if (level != ILogger.ELEVEL.ERROR) {
            if (mNextLogger != null)
                mNextLogger.log(level, msg);
            else
                System.out.println("your input level is not supported: " + level);
            return;
        }

        System.out.println("[Error] error message: " + msg);
    }
}