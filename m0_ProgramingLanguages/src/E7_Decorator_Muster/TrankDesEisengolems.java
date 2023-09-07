package E7_Decorator_Muster;

public class TrankDesEisengolems extends TrankEffectDecorator{

    private static final String BESCHREIBUNG = "Eisengolems";

    public TrankDesEisengolems(Character c) {
        super(c,BESCHREIBUNG);
    }

    @Override
    public int getRuestungswert() {
        return super.c.getRuestungswert()*2;
    }

    @Override
    public int getTrefferpunkte() {
        return super.c.getTrefferpunkte();
    }
}
