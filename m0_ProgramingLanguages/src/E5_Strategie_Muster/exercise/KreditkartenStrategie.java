package E5_Strategie_Muster.exercise;

public class KreditkartenStrategie implements Zahlungsstrategie{

    private String name;
    private String number;
    private String cvv;
    private String ablaufdatum;

    public KreditkartenStrategie(String name, String number, String cvv, String ablaufdatum) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.ablaufdatum = ablaufdatum;
    }

    @Override
    public void zahle(int preis) {
        System.out.println(preis + " mit Krditkarte " + number + " von " + name);
    }
}
