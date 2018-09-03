public interface IFileManager {
    void open(String uri);
    String getContent();
    void close();
}