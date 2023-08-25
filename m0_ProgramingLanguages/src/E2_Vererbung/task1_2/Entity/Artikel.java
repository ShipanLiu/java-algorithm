package E2_Vererbung.task1_2.Entity;

public class Artikel {
    protected String title;
    protected double preis;
    protected long barcode;

    public Artikel() {
    }

    public Artikel(String title, double preis, long barcode) {
        this.title = title;
        this.preis = preis;
        this.barcode = barcode;
    }

    public double getPreis() {
        return this.preis;
    }

    public long getBarcode() {
        return this.barcode;
    }

}
