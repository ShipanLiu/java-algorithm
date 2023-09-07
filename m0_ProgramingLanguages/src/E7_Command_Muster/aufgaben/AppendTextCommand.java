package E7_Command_Muster.aufgaben;

/*
*
* Step 3
* */

public class AppendTextCommand implements EditorCommand{

    private String textAlt; // textAlt 是 从 TextEditor 里面取出来的。
    private String textToAppend;
    private TextEditor textEditor;

    public AppendTextCommand(TextEditor editor, String text) {
        textEditor = editor;
        textAlt = editor.getText();
        textToAppend = text;
    }


    @Override
    public void execute() {
        textEditor.aendereText(textAlt + textToAppend);
    }

    @Override
    public void undo() {
        textEditor.aendereText(textAlt);
    }
}
