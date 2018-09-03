public class Txt implements  IText {
    public Txt() {
    }

    @Override
    public boolean openFile(String uri, int permission) {
        switch (permission) {
            case 1:
                System.out.println("read file: " + uri);
            break;

            case 2:
                System.out.println("over write file: " + uri);
            break;

            case 3:
                System.out.println("read and write file: " + uri);
            break;

            default:
                return false;
        }

        return true;
    }

    @Override
    public String read(int size) {
        System.out.println("read the content, buffer size: " + size);
        return "abcde";
    }

    @Override
    public void closeFile() {
        System.out.println("close file");
    }
}