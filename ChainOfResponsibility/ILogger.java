public abstract class ILogger {
    public enum ELEVEL {
        INFO,
        WARNING,
        ERROR
    }

    public ILogger() {
        mNextLogger = null;
    }

    protected ILogger mNextLogger;

    public ILogger setNextLogger(ILogger logger) {
        mNextLogger = logger;
        return this;
    }

    public abstract void log(ELEVEL level, String msg);
}