package E6_Observer_Muster.exercise;

import java.io.FileWriter;
import java.io.IOException;

/*
* step 4
* */

public class LogWriter implements  IChatBeobachter{
    public LogWriter() {

    }


    @Override
    public void aktualisieren(Nachrichten nachrichten) {
        // use FileWriter to write into the harddrive(uhrzeit, sender, )
        // create file name
        String filename = nachrichten.getEmpfaenger() + ".txt";
        // write
        try{
            FileWriter fw = new FileWriter(filename, true);
            fw.append("[" + nachrichten.getUhrzeit() + "]" + "[" + nachrichten.getText() +"]" + "[" + nachrichten.getSender() +"]\n");
            fw.close();
        }catch (IOException e) {
            System.out.println("file write error");
            e.printStackTrace();
        }
    }
}
