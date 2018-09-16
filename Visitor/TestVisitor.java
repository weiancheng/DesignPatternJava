public class TestVisitor {
	public static void main(String[] args) {
		System.out.println("This is Visitor Pattern");
		Position director = new Director();
		Position manager = new Manager();
		Position engineer = new Engineer();

		System.out.println("Director:");
		director.doTask(new DirectorTask());
		System.out.println("Manager:");
		manager.doTask(new ManagerTask());
		System.out.println("Engineer:");
		engineer.doTask(new EngineerTask());
	}
}