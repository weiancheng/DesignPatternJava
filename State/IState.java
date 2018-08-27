import java.util.HashMap;

public abstract class IState {
    public static enum ESTATE {
        RUN,
        PAUSE,
        STOP
    };

    protected HashMap<ESTATE, IState> mStateTable = new HashMap<ESTATE, IState>();

    public void setState(IState.ESTATE estate, IState state) {
        mStateTable.put(estate, state);
    }

    public abstract ESTATE getState();

    public abstract IState play(String music);
    public abstract IState pause();
    public abstract IState resume();
    public abstract IState stop();
}