public class Server {
	private static Server instance = null;

	private Server() {
	}

	public static Server getInstance() {
		if (instance == null) {
			instance = new Server();
		}

		return instance;
	}

	public void start() {
        if(instance != null) {
            System.out.println("starting server ...");
        }
    }
    
    public void stop() {
        if(instance != null) {
            System.out.println("stopping server ...");
        }
    }
}