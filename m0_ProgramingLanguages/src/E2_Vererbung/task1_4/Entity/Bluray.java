package E2_Vererbung.task1_4.Entity;

public class Bluray extends Artikel {
    private String regisseur;
    private String erscheinungsjahr;

    public Bluray(String title, double preis, long barcode, String regisseur, String erscheinungsjahr) {
        super(title, preis, barcode);
        this.regisseur = regisseur;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    @Override
    public String getBeschreibung() {
        return "Bluray{" +
                "regisseur='" + regisseur + '\'' +
                ", erscheinungsjahr='" + erscheinungsjahr + '\'' +
                ", title='" + title + '\'' +
                ", preis=" + preis +
                ", barcode=" + barcode +
                '}';
    }
}
