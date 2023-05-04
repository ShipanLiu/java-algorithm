package Exercise2_Vererbung.task1_3;


import Exercise2_Vererbung.task1_3.Entity.Artikel;
import Exercise2_Vererbung.task1_3.Entity.Buch;
import Exercise2_Vererbung.task1_3.Entity.CD;

public class test {

    public static void main(String[] args) {
        Buch buch1 = new Buch("UML 2.0", 9.8, 9783897215214L, 139, "Jier Dan", 2);
        Buch buch2 = new Buch("UML 3.0", 10.8, 9783897215215L, 140, "Jier Dan", 3);

        // but now we want put a CD into the list
        CD cd1 = new CD("cd1", 100, 123456789L, 30, "liujiba");
        Artikel[] list = new Artikel[]{buch1, buch2, cd1};

        for(Artikel i : list) {
            System.out.println(i.getBarcode() + "\t" + i.getBeschreibung());
        }
    }





}
