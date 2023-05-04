package Exercise2_Vererbung.task1_1.Entity;

public class Buch {
    private String title;
    private double preis;
    private long barcode;
    private int seiten;
    private String autor;
    private int auflage;

    public Buch(String title, double preis, long barcode, int seiten, String autor, int auflage) {
        this.title = title;
        this.preis = preis;
        this.barcode = barcode;
        this.seiten = seiten;
        this.autor = autor;
        this.auflage = auflage;
    }
    public double getPreis() {
        return this.preis;
    }

    public long getBarcode() {
        return this.barcode;
    }


// Buch{title='UML 3.0', preis=10.8, barcode=9783897215215, seiten=140, autor='Jier Dan', auflage=3}
    public String getBeschreibung() {
        return "Buch{" +
                "title='" + title + '\'' +
                ", preis=" + preis +
                ", barcode=" + barcode +
                ", seiten=" + seiten +
                ", autor='" + autor + '\'' +
                ", auflage=" + auflage +
                '}';
    }


}
