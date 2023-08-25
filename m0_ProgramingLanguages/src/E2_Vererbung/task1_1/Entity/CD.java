package E2_Vererbung.task1_1.Entity;

public class CD {

    private String title;
    private double preis;
    private long barcode;
    private int laufzeit;
    private String komponist;

    public CD(String title, double preis, long barcode, int laufzeit, String kompoist) {
        this.title = title;
        this.preis = preis;
        this.barcode = barcode;
        this.laufzeit = laufzeit;
        this.komponist = kompoist;
    }

    public double getPreis() {
        return this.preis;
    }

    public long getBarcode() {
        return this.barcode;
    }

    public String getBeschreibung() {
        return "CD{" +
                "title='" + title + '\'' +
                ", pries=" + preis +
                ", barcode=" + barcode +
                ", laufzeit=" + laufzeit +
                ", komponist='" + komponist + '\'' +
                '}';
    }

}
