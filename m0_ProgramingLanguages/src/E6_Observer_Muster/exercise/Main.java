package E6_Observer_Muster.exercise;

/*
* last step
*
* */

public class Main {
    public static void main(String[] args) {
        // create Observer instances
        IChatBeobachter anzeige1 = new Anzeige();
        IChatBeobachter anzeige2 = new Anzeige();
        IChatBeobachter anzeige3 = new Anzeige();
        IChatBeobachter anzeige4 = new Anzeige();
        // it's enough to register just one "LogWriter"
        IChatBeobachter logWriter1 = new LogWriter();

        // create Sender ---> this means I have to create ChatClient
        ChatClient cc = new ChatClient();

        // add all Observers into CharClient
        cc.registriereBeobachter(anzeige1);
        cc.registriereBeobachter(anzeige2);
        cc.registriereBeobachter(anzeige3);
        cc.registriereBeobachter(anzeige4);
        cc.registriereBeobachter(logWriter1);

        cc.schreibeNachricht("jiba1",  "我是发送者", "我是接收者");

    }
}
