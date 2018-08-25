public class Client implements IMessage {
	private int mUserId;

	public Client(int user_id) {
		mUserId = user_id;
	}

	@Override
	public void getMessage(String message) {
		System.out.println("User(" + mUserId + "): " + message);
	}
}