public class RunState extends IState {

    public RunState() {
    }

    @Override
    public IState.ESTATE getState() {
        return IState.ESTATE.RUN;
    }

    @Override
    public IState play(String music) {
        return this;
    }

    @Override
    public IState pause() {
        System.out.println("[State] run -> pause");
        return mStateTable.get(IState.ESTATE.PAUSE);
    }

    @Override
    public IState resume() {
        return this;
    }

    @Override
    public IState stop() {
        System.out.println("[State] run -> stop");
        return mStateTable.get(IState.ESTATE.STOP);
    }
}