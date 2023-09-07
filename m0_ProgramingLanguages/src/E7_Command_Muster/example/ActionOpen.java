package E7_Command_Muster.example;

/*
* step2 <---- ActionListenerCommand
* step3
* */

public class ActionOpen implements ActionListenerCommand{

    private Document document;

    public ActionOpen(Document doc) {
        this.document = doc;
    }

    @Override
    public void execute() {
        // 说实话 就是利用 document 内部定义的 open 方法。
        document.open();
    }
}
