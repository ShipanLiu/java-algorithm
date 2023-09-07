package E7_Command_Muster.example;

/*
 * step3 <---- ActionOpen
 * step4
 * */

public class ActionSave implements ActionListenerCommand {
    // according to UML , you have to associate a "document" hier
    private Document document;

    public ActionSave(Document doc) {
        this.document = doc;
    }


    @Override
    public void execute() {
        document.save();
    }
}
