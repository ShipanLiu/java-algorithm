package E10_Composite;

import java.util.ArrayList;
import java.util.Dictionary;

public class Directory implements FileSystemComponent{

    private String name;
    private ArrayList<FileSystemComponent> list;

    public Directory(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("this is Directory: " + name);
        for (FileSystemComponent component : list) {
            component.print();
        }
    }

    @Override
    public int getSize() {
        int sizeSum = 0;
        for(FileSystemComponent component : list) {
            sizeSum += component.getSize();
        }
        return sizeSum;
    }

    public void add(FileSystemComponent component) {
        list.add(component);
    }

    public void remove(FileSystemComponent component) {
        list.remove(component);
    }


}
