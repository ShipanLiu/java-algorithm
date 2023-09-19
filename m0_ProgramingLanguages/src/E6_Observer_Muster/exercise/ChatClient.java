package E6_Observer_Muster.exercise;

import java.util.ArrayList;

/*
* step5 : 开始创建 发布订阅的 ChatClient
* */
public class ChatClient {
    // define a Array to collect Observer
    private ArrayList<IChatBeobachter> list = new ArrayList<>();

    // add Observer into the list
    public void registriereBeobachter(IChatBeobachter beo) {
        if(!list.contains(beo)) {
            list.add(beo);
        }else {
            System.out.println("duplicate");
        }

    }

    //enferne Observer
    public void entferneBeobachter(IChatBeobachter beo) {
        if(list.contains(beo)) {
            list.remove(beo);
        } else {
            System.out.println("the to be removed does not exist");
        }
    }

    // notify all Observers [这个方法 private 是 最好的。]
    public void benachrichtigeBeobachter(Nachrichten nachrichten) {
        for(IChatBeobachter beo : list) {
            beo.aktualisieren(nachrichten);
        }
    }


    // sendNachrichten(传递 组成Nachrichten 的 具体信息)
    public void schreibeNachricht(String text, String sender, String empfaenger) {
        benachrichtigeBeobachter(new Nachrichten(text, sender, empfaenger));
    }

}
