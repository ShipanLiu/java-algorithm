package E2_Vererbung.task1_3.Entity;

public abstract class Artikel {
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


    // 假如有 method 是 abstract 的话，那么 类 也因该加上abstract
    public abstract String getBeschreibung();

}
