package Exercise2_Vererbung.task1_2.Entity;

public class Buch extends Artikel{
    private int seiten;
    private String autor;
    private int auflage;

    public Buch(String title, double preis, long barcode, int seiten, String autor, int auflage) {
        super(title, preis, barcode);
        this.seiten = seiten;
        this.autor = autor;
        this.auflage = auflage;
    }


    // in task1_3, we will implement the abstract method getBeschreibung

//    public String getBeschreibung() {
//        return "Buch{" +
//                "seiten=" + seiten +
//                ", autor='" + autor + '\'' +
//                ", auflage=" + auflage +
//                ", title='" + title + '\'' +
//                ", preis=" + preis +
//                ", barcode=" + barcode +
//                '}';
//    }
}
