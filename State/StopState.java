public class StopState extends IState {
    public StopState() {
    }

    @Override
    public IState.ESTATE getState() {
        return IState.ESTATE.STOP;
    }

    @Override
    public IState play(String music) {
        System.out.println("[State] stop -> start: " + music);
        return mStateTable.get(IState.ESTATE.RUN);
    }

    @Override
    public IState pause() {
        return this;
    }

    @Override
    public IState resume() {
        return this;
    }

    @Override
    public IState stop() {
        return this;
    }
}