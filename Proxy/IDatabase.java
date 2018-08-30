public interface IDatabase {
    public boolean openDatabase(String uri);
    public boolean getFile(String file_name);
    public boolean updateFile(String uri);
    public boolean closeDatabase();
}