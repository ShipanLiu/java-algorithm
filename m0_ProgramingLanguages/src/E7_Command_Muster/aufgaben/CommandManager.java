package E7_Command_Muster.aufgaben;


import java.util.Stack;

// 这个相当于 Menu， 可以调用很多 Command Pattern
public class CommandManager {
    private Stack<EditorCommand> undoItems = new Stack<>();

    public void executeCommand(EditorCommand cmd) {
        undoItems.push(cmd);  // archive this command
        cmd.execute();
    }

    public void undo() {
        EditorCommand cmd = undoItems.pop();
        cmd.undo();
    }
}
