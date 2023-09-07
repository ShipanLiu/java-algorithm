package E6_Observer_Muster.example;

public class Main {

    public static void main(String[] args) {
        // create Observers
        Observer p1 = new Customer("jiba1");
        Observer p2 = new Customer("jiba2");
        Observer p3 = new Customer("jiba3");
        Observer p4 = new Customer("jiba4");
        Observer p5 = new Customer("jiba5");

        // create ZeitungVerlag
        ZeitungsVerlag zv = new ZeitungsVerlag();

        // add Observers to ZeitungVerlag
        zv.addObserver(p1);
        zv.addObserver(p2);
        zv.addObserver(p3);
        zv.addObserver(p4);
        zv.addObserver(p5);

        // new Zeitung Notifitation
        zv.foundNewZeitung("new Niubi Zeitung");
    }
}
