public class TestComposite {
    public static void main(String[] args) {
        System.out.println("This is Composite Pattern");

        FileBase dir1 = new Directory("dir1");
        FileBase dir2 = new Directory("dir2");
        FileBase file1 = new File("file1");
        FileBase file2 = new File("file2");
        dir1.add(dir2);
        dir1.add(file1);
        dir1.add(file2);
        FileBase file3 = new File("file3");

        dir2.add(file3);

        FileBase test = dir1.find("file3");
        System.out.println("Did get the file3: " + ((test == null)?"false":"true"));
    }
}