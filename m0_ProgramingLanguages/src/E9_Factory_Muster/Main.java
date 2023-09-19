package E9_Factory_Muster;

public class Main {
    public static void main(String[] args) {
        // Erstelle eine deutsche Trikot-Factory
        AbstractTrikotFactory deFactory = new DeFactory();

        // Erstelle ein deutsches Trikot
        Product deTrikot = deFactory.erstelleTrikot("Muller", 13);

        // Drucke Informationen zum deutschen Trikot
        deTrikot.erstelle();

        // Erstelle eine englische Trikot-Factory
        AbstractTrikotFactory enFactory = new EnFactory();

        // Erstelle ein englisches Trikot
        Product enTrikot = enFactory.erstelleTrikot("Kane", 9);

        // Drucke Informationen zum englischen Trikot
        enTrikot.erstelle();

        Product pro= enFactory.erstelleShorts("jiba", "dan", "red");
        pro.erstelle();


    }

}
