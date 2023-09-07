package E7_Command_Muster.example;
/*
 * step4 <---- ActionSave
 * step5
 * */
public class MenuOperation {
    // a Menu should have multiple command:
    private ActionListenerCommand saveCommand;
    private ActionListenerCommand openCommand;

    public MenuOperation(ActionListenerCommand saveCommand, ActionListenerCommand openCommand) {
        this.saveCommand = saveCommand;
        this.openCommand = openCommand;
    }

    // to run the button on the Menu
    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }

}
