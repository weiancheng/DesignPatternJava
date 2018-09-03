public class FileManagerAdapter implements IFileManager {
    private IText mText;
    private int BUFFER_SIZE = 1024;

    public FileManagerAdapter(IText text_file) {
        mText = text_file;
    }

    @Override
    public void open(String uri) {
        mText.openFile(uri, 1);
    }

    @Override
    public String getContent() {
        return mText.read(BUFFER_SIZE);
    }

    @Override
    public void close() {
        mText.closeFile();
    }
}