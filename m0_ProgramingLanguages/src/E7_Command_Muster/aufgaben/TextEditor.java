package E7_Command_Muster.aufgaben;

/*
*
* step1 this is the first step:  create the entity
* */

public class TextEditor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void aendereText(String newText) {
        text = newText;
        System.out.println("the new text: " + newText);
    }

}
