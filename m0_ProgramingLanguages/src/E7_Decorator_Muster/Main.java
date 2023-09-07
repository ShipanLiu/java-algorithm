package E7_Decorator_Muster;

public class Main {
    public static void main(String[] args) {
        Character waldlaeufer = new Waldlaeufer();

        // Decorator uses Character as a parameter
        waldlaeufer = new TrankDerVitalitaet(waldlaeufer);  // upgrade 1
        waldlaeufer = new TrankDesEisengolems(waldlaeufer); // upgrade again
        waldlaeufer = new TrankDesBarbaren(waldlaeufer); // upgrade again

        System.out.println(waldlaeufer.getBezeichnung());
        System.out.println(waldlaeufer.getTrefferpunkte());
        System.out.println(waldlaeufer.getRuestungswert());

    }
}
