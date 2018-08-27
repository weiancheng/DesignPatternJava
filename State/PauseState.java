public class PauseState extends IState {
    public PauseState() {
    }

    @Override
    public IState.ESTATE getState() {
        return IState.ESTATE.PAUSE;
    }

    @Override
    public IState play(String music) {
        System.out.println("[State] reset music player, start playing " + music);
        return mStateTable.get(IState.ESTATE.RUN);
    }

    @Override
    public IState pause() {
        return this;
    }

    @Override
    public IState resume() {
        System.out.println("[State] pause -> run");
        return mStateTable.get(IState.ESTATE.RUN);
    }

    @Override
    public IState stop() {
        System.out.println("[State] pause -> stop");
        return mStateTable.get(IState.ESTATE.STOP);
    }
}