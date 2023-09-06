package E5_Iterator_Muster;
import java.util.Stack;


/*
* step2 , 看 UML， 我们已经创建了 BinaryTreeIterator, 现在创建 他的两个 children： DFSIterator 和 BFSIterator

*/

public class DFSIterator extends BinaryTreeIterator{

    // I need 3 Components now:  Binarytree(BinaryTreeIterator already has it), "knotenStack" and "previousStack"

    // knotenStack saved the nodes, that should be visted later.
    private Stack<Node> knotenStack;


    // previousStack saves the node, that were visited
    private Stack<Node> previousStack;

    public DFSIterator(Binaerbaum tree) {
        super(tree);
        this.knotenStack = new Stack<>();
        knotenStack.push(tree.getWurzelknoten());
        this.previousStack = new Stack<>();
    }


    /*
    *
    * Iterator 自带的 方法
    *
    * */

    @Override
    public boolean hasNext() {
        return !knotenStack.isEmpty();
    }

    @Override
    public Node next() {
        Node node = knotenStack.pop();

        // collect right node
        if(node.getRechts() != null) {
            knotenStack.push(node.getRechts());
        }
        // collect left node
        if(node.getLinks() != null) {
            knotenStack.push(node.getLinks());
        }

        // save  current node into previousStack
        previousStack.push(node);



        //return
        return node;
    }



    /*
    *
    * 自己需要定义的 方法：
    *
    * */


    @Override
    public Node peek() {
        // get the top node

        return knotenStack.peek();
    }

    @Override
    public Node previous() {
        // get the last visited node, and repush it into the knotenstack
        if(!previousStack.isEmpty()) {
            Node previous = previousStack.pop();
            knotenStack.push(previous);
            return previous;
        }
        // the previousStack is null.
        return null;
    }

}
