enum EState {
	EStateInit,
	EStateRunning,
	EStateStop,
	EStateIdle,
	EStateError
} 
	
abstract class BaseState {
	public abstract void doWork();
}
	
class StateRun extends BaseState {
	public void doWork() {
		System.out.println("this is running state.");
	}
}
	
class StateStop extends BaseState {
	public void doWork() {
		System.out.println("this is stopping state.");
	}
}
	
class StateIdle extends BaseState {
	public void doWork() {
		System.out.println("this is idle state.");
	}
}
	
class StateManager {
	private Map<EState, BaseState> mMapStateList = new HashMap<EState, BaseState>();
	private EState mNowState = EState.EStateInit;
		
	public StateManager() {
	}
		
	public void setState(EState estate, BaseState state) {
		System.out.println("set state: " + estate.toString());
		switch (estate) {
			case EStateRunning:
			case EStateStop:
			case EStateIdle:
				break;
				
			default:
				System.out.println("error state ...");
				return;
		}
		mMapStateList.put(estate, state);
	}
		
	private void doError() {
		mNowState = EState.EStateError;
		System.out.println("something wrong ...");
	}
		
	public void changeState(EState state) {
		System.out.println("try to change state from " + mNowState.toString() + " to " + state.toString());
		switch (state) {
			case EStateRunning:
				if(mNowState == EState.EStateRunning) {
					doError();
					return;
				}
				break;
					
			case EStateStop:
				if(mNowState == EState.EStateStop) {
					doError();
					return;
				}
				break;
					
			case EStateIdle:
				if(mNowState == EState.EStateIdle) {
					doError();
					return;
				}
				
				break;
				
			default:
				System.out.println("wrong state ...");
		}
		mNowState = state;
	}
	
	public void doWork() {
		mMapStateList.get(mNowState).doWork();
	}
	
	public void getNowState() {
		System.out.println("now state is " + mNowState.toString());
	}
}
	
class StatePattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		StateManager manager = new StateManager();
		manager.setState(EState.EStateRunning, new StateRun());
		manager.setState(EState.EStateStop, new StateStop());
		manager.setState(EState.EStateIdle, new StateIdle());
		
		manager.getNowState();
		manager.changeState(EState.EStateRunning);
		manager.changeState(EState.EStateIdle);
		manager.changeState(EState.EStateIdle);
		manager.getNowState();
		manager.changeState(EState.EStateStop);
		manager.getNowState();
	}
}