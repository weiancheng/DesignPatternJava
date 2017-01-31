class Server {
    private static Server mServer = null;
    
    private Server() {
    }
    
    public static Server getInstance() {
        if(mServer == null) {
            mServer = new Server();
        }
        return mServer;
    }
    
    public void Start() {
        if(mServer != null) {
            System.out.println("starting server ...");
        }
    }
    
    public void Stop() {
        if(mServer != null) {
            System.out.println("stopping server ...");
        }
    }
}

class SingletonPattern
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Server server = Server.getInstance();
        server.Start();
        server.Stop();
    }
}