package E9_Factory_Muster;

/*
 * step3
 * */

public abstract class AbstractTrikotFactory {

    public abstract Product erstelleTrikot(String name, int number);
    public abstract Product erstelleShorts(String leftLeg, String rightLeg, String color);
    public abstract Product erstelleSchuhe(String muster, String color);
}
