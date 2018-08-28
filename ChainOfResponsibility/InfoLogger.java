public class InfoLogger extends ILogger {
    public InfoLogger() {
        super();
    }

    @Override
    public void log(ILogger.ELEVEL level, String msg) {
        if (level != ILogger.ELEVEL.INFO) {
            if (mNextLogger != null)
                mNextLogger.log(level, msg);
            else
                System.out.println("your input level is not supported: " + level);
            return;
        }

        System.out.println("[INFO] information: " + msg);
    }
}