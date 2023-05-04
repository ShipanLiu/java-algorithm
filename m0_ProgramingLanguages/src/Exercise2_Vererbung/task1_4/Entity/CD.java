package Exercise2_Vererbung.task1_4.Entity;

public class CD extends Artikel {
    private int laufzeit;
    private String komponist;

    public CD(String title, double preis, long barcode, int laufzeit, String komponist) {
        super(title, preis, barcode);
        this.laufzeit = laufzeit;
        this.komponist = komponist;
    }


    @Override
    public String getBeschreibung() {
        return "CD{" +
                "laufzeit=" + laufzeit +
                ", komponist='" + komponist + '\'' +
                ", title='" + title + '\'' +
                ", preis=" + preis +
                ", barcode=" + barcode +
                '}';
    }
}
