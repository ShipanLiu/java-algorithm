package E9_Factory_Muster;

/*
* 为德国生产产品
*
* */

public class DeFactory extends AbstractTrikotFactory{
    @Override
    public Product erstelleTrikot(String name, int number) {
        System.out.println("produce a german Trikot with " + name + " " + number);
        return new Spielertrikot(name+number, name+number, "white", "black");
    }

    @Override
    public Product erstelleShorts(String leftLeg, String rightLeg, String color) {
        return new Shorts(leftLeg, rightLeg, color);
    }

    @Override
    public Product erstelleSchuhe(String muster, String color) {
        return new Schuhe(muster, color);
    }
}
