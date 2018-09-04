public class TestSingleton {
	public static void main(String[] args) {
		System.out.println("This is Singleton Pattern");

		Server server = Server.getInstance();
		server.start();
		server.stop();
	}
}