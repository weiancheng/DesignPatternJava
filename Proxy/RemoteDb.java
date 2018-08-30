public class RemoteDb implements IDatabase {
    // private Socket mSocket;

    public RemoteDb() {
    }

    @Override
    public boolean openDatabase(String uri) {
        // mSocket.connect(uri);
        System.out.println("create a thread for connecting with remote server...");
        System.out.println("get connection...");
        return true;
    }

    @Override
    public boolean getFile(String file_name) {
        System.out.println("send command to server for searching the file: " + file_name);
        System.out.println("get the file and download...");
        // mSocket.read(file_name);
        return true;
    }

    @Override
    public boolean updateFile(String uri) {
        System.out.println("update the file: " + uri);
        // mSocket.write(uri);
        return true;
    }

    @Override
    public boolean closeDatabase() {
        System.out.println("disconnect with remote server");
        // mSocket.close();
        return true;
    }
}