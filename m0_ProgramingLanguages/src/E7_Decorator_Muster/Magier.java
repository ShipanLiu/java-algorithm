package E7_Decorator_Muster;

/*
* Step 3
* */
public class Magier implements Character{

    private static final int DEFAULT_TP = 20;
    private static final int DEFAULT_RW = 10;

    @Override
    public int getRuestungswert() {
        return DEFAULT_RW;
    }

    @Override
    public int getTrefferpunkte() {
        return DEFAULT_TP;
    }

    @Override
    public String getBezeichnung() {
        return "this is Magier";
    }
}
