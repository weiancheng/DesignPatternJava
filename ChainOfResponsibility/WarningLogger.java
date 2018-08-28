public class WarningLogger extends ILogger {
    public WarningLogger() {
        super();
    }

    @Override
    public void log(ILogger.ELEVEL level, String msg) {
        if (level == ILogger.ELEVEL.WARNING) {
            if (mNextLogger != null)
                mNextLogger.log(level, msg);
            else
                System.out.println("your input level is not supported: " + level);
            return;
        }

        System.out.println("[Warning] " + msg);
    }
}