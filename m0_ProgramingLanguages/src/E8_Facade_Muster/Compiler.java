package E8_Facade_Muster;

public class Compiler {
    private Parser parser = new Parser();
    private Assembler assembler = new Assembler();
    private Linker linker = new Linker();

    private void compileInternal(String sourceFile) {
        System.out.println("Generating " + sourceFile + ".asm");
    }

    public void compile(String sourceFile) {
        parser.parse(sourceFile);

        compileInternal(sourceFile);
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
    }

}
