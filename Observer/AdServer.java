import java.util.ArrayList;

public class AdServer {
	private ArrayList<IMessage> mClientList = new ArrayList<IMessage>();

	public AdServer() {
	}

	public void registerClient(IMessage client) {
		mClientList.add(client);
	}

	public void sendAdMessage(String msg) {
		for (IMessage client: mClientList) {
			client.getMessage(msg);
		}
	}
}