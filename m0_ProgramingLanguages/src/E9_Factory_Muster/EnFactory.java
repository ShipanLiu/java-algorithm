package E9_Factory_Muster;

/*
* 为英国生产产品
* */

public class EnFactory extends AbstractTrikotFactory{
    @Override
    public Product erstelleTrikot(String name, int number) {
        System.out.println("produce a english Trikot with " + name + " " + number);
        return new Spielertrikot(name+number, name+number, "yellow", "red");
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
