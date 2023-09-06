package E5_Strategie_Muster.example;

public class Betriebssystem {

    private Strategie strategie;

    public Betriebssystem(Strategie strategie) {
        this.strategie = strategie;
    }

    @Override
    public String toString() {
        if(strategie != null) {
            return "Betriebssystem ist: " + strategie.getOS();
        } else {
            return "Unknown Betriebssystem";
        }
    }
}
