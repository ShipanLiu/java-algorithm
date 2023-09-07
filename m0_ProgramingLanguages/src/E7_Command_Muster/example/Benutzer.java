package E7_Command_Muster.example;

/*
* step5 <--- MenuOperation
* step6
* */
public class Benutzer {
    public static void main(String[] args) {
        // now I have a document
        Document doc = new Document("jiba.txt");

        // I need to save it ==> before operation, I need to create save and open COMMAND PATTERN
        ActionListenerCommand openCommandPattern = new ActionOpen(doc);
        ActionListenerCommand saveCommandPattern = new ActionSave(doc);

        // now the user opne the menu ==> menu opend, menu will direct load the save and open COMMAND PATTERN
        MenuOperation menu = new MenuOperation(saveCommandPattern, openCommandPattern);
        // now the user can click open and save button
        menu.clickOpen();
        menu.clickSave();

    }
}
