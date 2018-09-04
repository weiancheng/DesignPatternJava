public abstract class FileBase {
    protected enum EFileType {
        EFile,
        EDirectory
    }

    protected String mFileName;
    protected EFileType mFileType;

    public FileBase(String fileName, EFileType fileType) {
        mFileName = fileName;
        mFileType = fileType;
    }

    public abstract void add(FileBase file);

    public abstract void remove(String fileName);

    public abstract FileBase find(String fileName);
}