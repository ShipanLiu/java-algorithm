package E6_Observer_Muster.exercise;

import java.util.Date;

/*
* strp 1
*
* */

public class Nachrichten {
    private Date uhrzeit;
    private String text;
    private String empfaenger;
    private String sender;

    public Nachrichten(String text, String empfaenger, String sender) {
        this.uhrzeit = new Date();
        this.text = text;
        this.empfaenger = empfaenger;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }
    public String getEmpfaenger() {
        return empfaenger;
    }

    public String getSender() {
        return sender;
    }
    public Date getUhrzeit() {
        return uhrzeit;
    }

}
