package E5_Iterator_Muster;

import java.util.Iterator;
/*
*
* Step 4， 注意要在 Baum 里面加上 Iterator 的特征。
*
* */


/*
* The Iterable interface in Java is a part of the Java Collections Framework and
* is used to provide a way to iterate over a collection of elements. Classes that
* implement the Iterable interface must provide an implementation for the iterator()
* method, which returns an Iterator object. The Iterator object allows you to traverse
*  the collection, one element at a time, without needing to know the underlying
* structure of the collection.
*
* 这就优点像 Comparable 了
*
*
* */

//Why Use Iterable?
//        For-each Loop: The primary reason to implement Iterable is to allow the use of the enhanced for-each loop (for(E element : collection)) on your custom object.
//
//        Code Reusability: By adhering to the Iterable contract, you can use existing Java utilities and algorithms that work on Iterable types without having to rewrite them.
//
//        Readability: Implementing Iterable makes it clear that your object can be iterated over, making the code more self-explanatory.
//
//        Compatibility: Libraries that expect Iterable objects can use your object seamlessly.

public class Binaerbaum implements Iterable<Node>{

    private Node wurzelknoten;

    /*insert node into tree  -->   actually you use the method insertRekursiv() from Node */
    public void insert(Person newPerson) {
        // wrap the node into a person
        if(wurzelknoten == null) {
            wurzelknoten = new Node(newPerson);
        } else {
            // insert into the tree
            wurzelknoten.insertRecursive(newPerson);
        }
    }

    public Person find(int id) {
        if(wurzelknoten == null) {
            //  the tree is empty
            return null;
        } else {
            return wurzelknoten.findRecursive(id);
        }
    }

    // 一个 getter 方法
    public Node getWurzelknoten() {
        return wurzelknoten;
    }

    public BinaryTreeIterator createDFSIterator() {
        return new DFSIterator(this);
    }

    public BinaryTreeIterator createBFSIterator() {
        return new BFSIterator(this);
    }


    /*
    * iterator pattern 就是 这样的：
    *
    *step1:  在 Binaerbaum implements Iterable<Node>   <----- 这里 需要我传进去一个 Iterator
    *step2： 那我就创建 myIterator  <------- myIterator 要 implememts Iterator
    *
    * 例子：  看下面 chatGPT 给的 例子。
    *
    * */

    @Override
    public Iterator<Node> iterator() {
        // DFS is standard
        return createDFSIterator();
    }
}




/*
ChatGPT 给的例子。

import java.util.Iterator;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class Binaerbaum implements Iterable<Node> {
    Node root;

    @Override
    public Iterator<Node> iterator() {
        // Implement the iterator logic here
        return new BinaerbaumIterator(this);
    }
}

class BinaerbaumIterator implements Iterator<Node> {
    // Implementation details here

    Binaerbaum tree;
    Node currentNode;

    BinaerbaumIterator(Binaerbaum tree) {
        this.tree = tree;
        this.currentNode = tree.root;
        // Initialization logic here
    }

    @Override
    public boolean hasNext() {
        // Check if there's a next Node
        return false; // Simplified; you would implement the real logic here
    }

    @Override
    public Node next() {
        // Return the next Node
        return null; // Simplified; you would implement the real logic here
    }
}

public class Main {
    public static void main(String[] args) {
        Binaerbaum tree = new Binaerbaum();
        // Populate the tree here

        for (Node node : tree) {
            System.out.println(node.value);
        }
    }
}
*/

