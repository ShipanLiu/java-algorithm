package E8_Facade_Muster;


/*
*
* step 2
* */



public class Parser {
    private Scanner scanner = new Scanner();  //省掉了 用constructor 的麻烦(UML里也不允许你有 Constructor)


    public void parse(String sourceFile) {
        // do things==> scann + parse
        scanner.scan(sourceFile);
        System.out.println("Parser: " + sourceFile);
    }
}
