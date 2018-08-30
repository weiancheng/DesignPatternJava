public class LocalDb implements IDatabase {
    public LocalDb() {
    }

    @Override
    public boolean openDatabase(String uri) {
        System.out.println("open the database: " + uri);
        return true;
    }

    @Override
    public boolean getFile(String file_name) {
        System.out.println("search the file: " + file_name);
        System.out.println("open the file...");
        return true;
    }

    @Override
    public boolean updateFile(String uri) {
        System.out.println("write the content to database");
        return true;
    }

    @Override
    public boolean closeDatabase() {
        System.out.println("close the database");
        return true;
    }
}