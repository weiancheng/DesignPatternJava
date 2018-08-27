public class MusicPlayer {
    private IState mState;

    public MusicPlayer() {
        IState play = new RunState();
        IState stop = new StopState();
        IState pause = new PauseState();

        play.setState(IState.ESTATE.STOP, stop);
        play.setState(IState.ESTATE.PAUSE, pause);

        stop.setState(IState.ESTATE.RUN, play);
        stop.setState(IState.ESTATE.PAUSE, pause);

        pause.setState(IState.ESTATE.RUN, play);
        pause.setState(IState.ESTATE.STOP, stop);

        mState = stop;
    }

    public boolean play(String music) {
        mState = mState.play(music);
        return (mState.getState() == IState.ESTATE.RUN);
    }

    public boolean pause() {
        mState = mState.pause();
        return mState.getState() == IState.ESTATE.PAUSE;
    }

    public boolean resume() {
        mState = mState.resume();
        return mState.getState() == IState.ESTATE.RUN;
    }

    public boolean stop() {
        mState = mState.stop();
        return mState.getState() == IState.ESTATE.STOP;
    }
}