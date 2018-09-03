public class TestAdapter {
    public static void main(String [] arg) {
        System.out.println("This is Adapter Pattern");

        IText text = new Txt();
        IFileManager manager = new FileManagerAdapter(text);
        manager.open("test.txt");
        System.out.println("Test: get content: " + manager.getContent());
        manager.close();
    }
}