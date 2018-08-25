public class TestObserver {
	public static void main(String []arg) {
		System.out.println("This is Observer Pattern");

		AdServer server = new AdServer();
		IMessage client1 = new Client(1);
		IMessage client2 = new Client(2);
		IMessage client3 = new Client(3);

		server.registerClient(client1);
		server.registerClient(client2);
		server.registerClient(client3);

		server.sendAdMessage("Desks are on sale!!");
	}
}