public class DirectorTask implements Task {
	public DirectorTask() {
	}

	@Override
	public void doDirectorTask(Position director) {
		System.out.println("do the task of director");
	}

	@Override
	public void doManagerTask(Position manager) {
		System.out.println("director supports manager");
	}

	@Override
	public void doEngineerTask(Position engineer) {
		System.out.println("director supports engineer");
	}
}