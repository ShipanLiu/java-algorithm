package E7_Command_Muster.example;

import java.io.File;

/*
*
* step1
*
* */

public class Document {
    private File file;

    public Document(File file) {
        this.file = file;
    }

    public Document(String name) {
        file = new File(name);
    }

    public void open() {
        System.out.println("OPEN! file at path " + " [" + getFilepath() + "] " +  " opened");
    }

    public void save() {
        System.out.println("SAVE! file at path " + " [" + getFilepath() + "] " +  " saved");
    }

    public String getFilepath() {
        return file.toString();
    }

}
