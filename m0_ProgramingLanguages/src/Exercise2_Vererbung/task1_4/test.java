package Exercise2_Vererbung.task1_4;


import Exercise2_Vererbung.task1_4.Entity.*;

public class test {

    public static void main(String[] args) {
        Buch buch1 = new Buch("UML 2.0", 9.8, 9783897215214L, 139, "Jier Dan", 2);
        Buch buch2 = new Buch("UML 3.0", 10.8, 9783897215215L, 140, "Jier Dan", 3);

        // but now we want put a CD into the list
        CD cd1 = new CD("cd1", 100, 982647612316253L, 30, "liujiba");

        DVD dvd1 = new DVD("cd1", 100, 1231094846589L, "jier", "1999-02");
        DVD dvd2 = new DVD("cd1", 100, 1231094846589L, "jier", "1999-02");
        Bluray bluray = new Bluray("blury1", 100, 123456892749729L, "dan", "1999-02");


        Artikel[] list = new Artikel[]{buch1, buch2, cd1, dvd1, dvd2, bluray};

        for (Artikel i : list) {
            if (i instanceof CD) {
                System.out.println(i.getBarcode() + "\t" + i.getBeschreibung());
            }
        }

        System.out.println("|||||||||||||||||||||||||||||");
        for (Artikel i : list) {
            if (i instanceof Buch) {
                System.out.println(i.getBarcode());
            }
        }

        System.out.println("|||||||||||||||||||||||||||||");
        double sumPries = 0;
        for (Artikel i : list) {
            if (i instanceof DVD) {
                sumPries += i.getPreis();
            }
        }

        System.out.println("sunPreis: " + sumPries);

        System.out.println("|||||||||||||||use Casting||||||||||||||");
        //  use Casting
        for(int i = 0; i < list.length; i++) {
            try{
                Buch b = (Buch)list[i];
                System.out.println(b.getAutor());
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
