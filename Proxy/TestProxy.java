public class TestProxy {
    public static void main(String [] arg) {
        System.out.println("This is Proxy Pattern");

        IDatabase db = new RemoteDb();
        db.openDatabase("https://192.168.0.1");
        db.getFile("test.txt");
        db.updateFile("test.txt");
        db.closeDatabase();
    }
}