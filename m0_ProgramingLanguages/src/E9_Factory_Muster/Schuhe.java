package E9_Factory_Muster;

public class Schuhe implements Product{
    private String muster;

    public Schuhe(String muster, String color) {
        this.muster = muster;
        this.color = color;
    }

    private String color;

    @Override
    public void erstelle() {
        System.out.println("Schuhe produced");
    }
}
