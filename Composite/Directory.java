import java.util.ArrayList;

public class Directory extends FileBase {
    private ArrayList<FileBase> mFileList;

    public Directory(String fileName) {
        super(fileName, EFileType.EDirectory);
        mFileList = new ArrayList<FileBase>();
    }

    @Override
    public void add(FileBase file) {
        mFileList.add(file);
    }

    @Override
    public void remove(String fileName) {
        for (FileBase file: mFileList) {
            if (file.mFileName == fileName) {
                mFileList.remove(file);
            }
        }
    }

    @Override
    public FileBase find(String fileName) {
        for (FileBase file: mFileList) {
            if (file.mFileName == fileName) {
                return file;
            }

            if (file.mFileType == EFileType.EDirectory) {
                FileBase f = file.find(fileName);
                if (f != null)
                    return f;
            }
        }

        return null;
    }
}