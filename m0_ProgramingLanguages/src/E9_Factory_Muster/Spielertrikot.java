package E9_Factory_Muster;

/*
 * step2
 * */

public class Spielertrikot implements Product {

    private String front;
    private String back;
    private String color1;
    private String color2;

    public Spielertrikot(String front, String back, String color1, String color2) {
        this.front = front;
        this.back = back;
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void erstelle() {
        System.out.println("print with success");
    }
}
