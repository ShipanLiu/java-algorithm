package E7_Decorator_Muster;

/*
*
* step 4
* */


public abstract class TrankEffectDecorator implements Character {

    /*因为 abstract class extends interface，you don't have to overwrite*/
    protected Character c;
    protected String bezeichnung;

    public TrankEffectDecorator(Character c, String bezeichnung) {
        this.c = c;
        this.bezeichnung = bezeichnung;
    }


    // 提前实现 interface 里的 getBezeichnung 方法。
    @Override
    public String getBezeichnung() {
        return c.getBezeichnung() + "; " + bezeichnung;  // original beschreibung + upgrade beschreibung
    }

}
