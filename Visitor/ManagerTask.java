public class ManagerTask implements Task {
	public ManagerTask() {
	}

	@Override
	public void doDirectorTask(Position director) {
		System.out.println("too high level...");
	}

	@Override
	public void doManagerTask(Position manager) {
		System.out.println("do the task of manager");
	}

	@Override
	public void doEngineerTask(Position engineer) {
		System.out.println("manager supports engineer");
	}
}