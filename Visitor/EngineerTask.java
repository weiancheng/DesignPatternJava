public class EngineerTask implements Task {
	public EngineerTask() {
	}

	@Override
	public void doDirectorTask(Position director) {
		System.out.println("too high level...");
	}

	@Override
	public void doManagerTask(Position manager) {
		System.out.println("too high level...");
	}

	@Override
	public void doEngineerTask(Position engineer) {
		System.out.println("do the task of engineer");
	}
}