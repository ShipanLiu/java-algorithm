package E10_Composite;


public class Main {
    public static void main(String[] args) {
        Directory folder1 = new Directory("folder1");
        Directory folder2 = new Directory("folder2");
        Directory folder3 = new Directory("folder3");

        FileSystemComponent file1 = new File("file1", 20);
        FileSystemComponent file2 = new File("file2", 60);
        FileSystemComponent file3 = new File("file3", 90);

        folder1.add(folder2);
        folder2.add(folder3);

        folder3.add(file1);
        folder3.add(file2);

        folder1.add(file3);

        System.out.println("total size of folder1: " +  folder3.getSize());
        folder1.print();

    }
}
