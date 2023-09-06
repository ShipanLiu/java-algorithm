package E5_Iterator_Muster;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/*
* step3 , 看 UML， 我们已经创建了 BinaryTreeIterator, 现在创建 他的两个 children： DFSIterator 和 BFSIterator

*/

public class BFSIterator extends BinaryTreeIterator{

    /*
    *
    * 为什么 DFS 用stack ，   BFS 却用 queue？
    *
    * In BFS, we explore all the neighbors of a node before going to the next level of neighbors.
    * Because we're exploring level by level, a queue (First-In-First-Out, FIFO) is the most natural data structure to use.
    * When you enqueue all neighbors of a node, they will be dequeued before their respective neighbors get enqueued, ensuring that nodes are processed level by level.
    *
    *
    * In DFS, we explore as far down one branch as possible before backtracking.
    *A stack (Last-In-First-Out, LIFO) is suitable here because we want to explore a full branch down to a leaf before backtracking. When you push neighbors of a node onto the stack, （两个 neighbor 会先后 被push 到 stack 里面）the last neighbor gets popped first, ensuring that you go as deep as possible down one branch before backtracking.
    *
    * */

    // knotenStack saved the nodes, that should be visted later.
    private Queue<Node> knotenQueue;


    // previousStack saves the node, that were visited
    private Stack<Node> previousStack;

    public BFSIterator(Binaerbaum tree) {
        super(tree);
        this.knotenQueue = new LinkedList<>();
        knotenQueue.add(tree.getWurzelknoten());
        this.previousStack = new Stack<>();
    }


    /*
    *
    * Iterator 自带的 方法
    *
    * */

    @Override
    public boolean hasNext() {
        return !knotenQueue.isEmpty();
    }

    @Override
    public Node next() {
        Node node = knotenQueue.poll();

        // collect right node
        if(node.getRechts() != null) {
            knotenQueue.add(node.getRechts());
        }
        // collect left node
        if(node.getLinks() != null) {
            knotenQueue.add(node.getLinks());
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

        return knotenQueue.peek();
    }

    @Override
    public Node previous() {
        // get the last visited node, and repush it into the knotenstack
        if(!previousStack.isEmpty()) {
            Node previous = previousStack.pop();
            knotenQueue.add(previous);
            return previous;
        }
        // the previousStack is null.
        return null;
    }

}
