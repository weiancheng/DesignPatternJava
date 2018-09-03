public interface IText {
    boolean openFile(String uri, int permission);
    String read(int size);
    void closeFile();
}