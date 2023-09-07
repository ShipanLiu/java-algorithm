package E7_Decorator_Muster;

public class TrankDerVitalitaet extends TrankEffectDecorator{

    private static final String BEZEICHNUNG = "Vitalitaet";

    public TrankDerVitalitaet(Character c) {
        super(c, BEZEICHNUNG);
    }

    @Override
    public int getRuestungswert() {
//        return super.c.getRuestungswert();  // 可以省略 super
        return c.getRuestungswert();
    }

    @Override
    public int getTrefferpunkte() {
        return c.getTrefferpunkte() + 10;
    }
}
