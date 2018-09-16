public class Manager implements Position {
	public Manager() {
	}

	@Override
	public void doTask(Task task) {
		task.doManagerTask(this);
		task.doEngineerTask(this);
	}
}