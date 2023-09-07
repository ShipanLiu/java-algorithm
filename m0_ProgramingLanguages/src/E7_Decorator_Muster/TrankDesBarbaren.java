package E7_Decorator_Muster;

public class TrankDesBarbaren extends TrankEffectDecorator{

    private static final String BESCHREIBUNG = "Barbaren";

    public TrankDesBarbaren(Character c) {
        super(c,BESCHREIBUNG);
    }

    @Override
    public int getRuestungswert() {
        return super.c.getRuestungswert() - 5;
    }

    @Override
    public int getTrefferpunkte() {
        return super.c.getTrefferpunkte() + 5;
    }
}
