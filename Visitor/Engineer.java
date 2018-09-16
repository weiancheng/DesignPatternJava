public class Engineer implements Position {
	public Engineer() {
	}

	@Override
	public void doTask(Task task) {
		task.doEngineerTask(this);
	}
}