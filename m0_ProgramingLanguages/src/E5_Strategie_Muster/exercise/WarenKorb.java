package E5_Strategie_Muster.exercise;


public class WarenKorb {
    private Zahlungsstrategie zahlStra;

    public WarenKorb(Zahlungsstrategie zahlStra) {
        this.zahlStra = zahlStra;
    }

    // 使用set 方法， 支持动态 设置

    public void setZahlStra(Zahlungsstrategie newZahlStra) {
        zahlStra = newZahlStra;
    }

    public void zahle(int preis) {
        if(zahlStra != null) {
            zahlStra.zahle(preis);
        } else {
            System.out.println("Unknown Zahlungsstratiegie-null");
        }
    }
}
