package Exercise2_Vererbung.task1_4.Entity;

public class Buch extends Artikel {
    private int seiten;
    private String autor;
    private int auflage;

    public Buch(String title, double preis, long barcode, int seiten, String autor, int auflage) {
        super(title, preis, barcode);
        this.seiten = seiten;
        this.autor = autor;
        this.auflage = auflage;
    }


    @Override
    public String getBeschreibung() {
        return "Buch{" +
                "seiten=" + seiten +
                ", autor='" + autor + '\'' +
                ", auflage=" + auflage +
                ", title='" + title + '\'' +
                ", preis=" + preis +
                ", barcode=" + barcode +
                '}';
    }

    public String getAutor() {
        return this.autor;
    }
}
