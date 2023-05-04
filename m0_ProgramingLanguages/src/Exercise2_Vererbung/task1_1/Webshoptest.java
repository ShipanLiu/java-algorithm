package Exercise2_Vererbung.task1_1;

import Exercise2_Vererbung.task1_1.Entity.Buch;
import Exercise2_Vererbung.task1_1.Entity.CD;

public class Webshoptest {
    public static void main(String[] args) {
        Buch buch1 = new Buch("UML 2.0", 9.8, 9783897215214L, 139, "Jier Dan", 2);
        Buch buch2 = new Buch("UML 3.0", 10.8, 9783897215215L, 140, "Jier Dan", 3);
        printMoreExpensiveBuch(buch1, buch2);


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        // 验证为什么我们 需要  father class
        Buch[] buch_list1 = new Buch[]{buch1, buch2};


        for(Buch i : buch_list1) {
            System.out.println(i.getBarcode() + "\t" + i.getBeschreibung());
        }

        // but now we want put a CD into the list
        CD cd1 = new CD("cd1", 100, 123456789L, 30, "liujiba");
//        Buch[] buch_list2 = new Buch[]{buch1, buch2, cd1};





    }

    public static void printMoreExpensiveBuch(Buch b1, Buch b2) {
        Buch b = b1.getPreis() > b2.getPreis() ? b1 : b2;
        System.out.println(b.getBeschreibung());
        System.out.println("Preis: " + b.getPreis() + "Euro");
        System.out.println("Barcode: " + b.getBarcode());
    }
}


