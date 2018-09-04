public class File extends FileBase {
    public File(String fileName) {
        super(fileName, EFileType.EFile);
    }

    @Override
    public  void add(FileBase file) {
        System.out.println("this format is a file");
    }

    @Override
    public void remove(String fileName) {
        System.out.println("this format is a file");
    }

    @Override
    public FileBase find(String fileName) {
        System.out.println("this format is a file");
        return null;
    }
}