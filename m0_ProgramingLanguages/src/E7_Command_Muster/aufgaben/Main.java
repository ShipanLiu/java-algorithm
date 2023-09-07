package E7_Command_Muster.aufgaben;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("Some text");

        AppendTextCommand cmd1 = new AppendTextCommand(editor, "this is new text 1");
        AppendTextCommand cmd2 = new AppendTextCommand(editor, "this is new text 2");

        CommandManager mgr = new CommandManager();

        mgr.executeCommand(cmd1);
        mgr.executeCommand(cmd2);

        mgr.undo();

    }
}
