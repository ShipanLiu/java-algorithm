package E10_Template;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class DatenHandler {
    public File file;

    public DatenHandler(File file) {
        this.file = file;
    }

    public Aktienkurs einlesen() {
        if(!validiereDateipfad()) {
            System.out.println(file + " : " + "file existiert nicht");
            return null;
        }

        if(!validiereDatentyp()) {
            System.out.println("date type existeiert nicht");
            return null;
        }

//        return transformierenDaten();
        return null;
    }

    public boolean validiereDateipfad() {
        return file.canRead();
    }


    /*
    *
    * 下面的这两个 fucntion 是根据datei的 类型来确定
    * */

    public abstract boolean validiereDatentyp();

    public abstract Aktienkurs transformierenDaten() throws FileNotFoundException;

}
