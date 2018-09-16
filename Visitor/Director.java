public class Director implements Position {
	public Director() {
	}

	@Override
	public void doTask(Task task) {
		task.doDirectorTask(this);
		task.doManagerTask(this);
	}
}