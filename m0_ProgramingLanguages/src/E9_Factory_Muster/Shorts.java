package E9_Factory_Muster;

public class Shorts implements Product{
    private String leftLeg;
    private String rightLeg;
    private String color;

    public Shorts(String leftLeg, String rightLeg, String color) {
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.color = color;
    }

    @Override
    public void erstelle() {
        System.out.println("shorts produced");
    }
}
