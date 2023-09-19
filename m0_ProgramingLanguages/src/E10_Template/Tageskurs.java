package E10_Template;
/*
* step1
* */

import java.util.Date;

public class Tageskurs {
    public Date date;
    public Double eroeffnungswert;
    public Double maximalwert;
    public Double minimalwert;
    public Double schlusswert;

    public Tageskurs(Date date, Double eroeffnungswert, Double maximalwert, Double minimalwert, Double schlusswert) {
        this.date = date;
        this.eroeffnungswert = eroeffnungswert;
        this.maximalwert = maximalwert;
        this.minimalwert = minimalwert;
        this.schlusswert = schlusswert;
    }
}
