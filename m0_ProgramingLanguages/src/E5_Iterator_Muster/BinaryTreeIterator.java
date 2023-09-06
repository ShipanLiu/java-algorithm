package E5_Iterator_Muster;

/*
* step1
*
* 为什么是 abstract？ becuuse I don't want to implemnet the interface, I just want to add some attributes
*
*
* */

public abstract class BinaryTreeIterator implements MyIterator{

    // because I need to use this "binaerbaum" in the child class(see uml), so I set it to protected
    protected Binaerbaum binaerbaum;

    public BinaryTreeIterator(Binaerbaum binaerbaum) {
        this.binaerbaum = binaerbaum;
    }
}
