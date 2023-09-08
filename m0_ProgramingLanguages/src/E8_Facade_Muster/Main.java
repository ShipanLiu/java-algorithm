package E8_Facade_Muster;

public class Main {
    public static void main(String[] args) {

        String sourceFile = "hallo, this is the sourceFile";

        Compiler compiler = new Compiler();
        compiler.compile(sourceFile);
    }
}
