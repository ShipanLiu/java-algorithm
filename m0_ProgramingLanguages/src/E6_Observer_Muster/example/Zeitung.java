package E6_Observer_Muster.example;

import java.util.Date;

/*
* step1:
* */
public class Zeitung {
    private Date date;
    private String title;

    public Zeitung(Date date, String title) {
        this.date = date;
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }
}
