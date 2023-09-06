package E4_Datenstrucktur;

/*
* Binaerbaum 的组成部分 就是 node
*
*
*
* */

// 这里我声明
public class Binaerbaum<T extends Comparable<T>> {

    private Node<T> wurzelknoten;

    /*insert node into tree  -->   actually you use the method insertRekursiv() from Node */
    public void insert(T t) {
        // wrap the node into a person
        if(wurzelknoten == null) {
            wurzelknoten = new Node<T>(t);
        } else {
            // insert into the tree
            wurzelknoten.insertRekursiv(t);
        }
    }

    public T find(T t) {
        if(wurzelknoten == null) {
            //  the tree is empty
            return null;
        } else {
            return wurzelknoten.findRekursiv(t);
        }
    }

}
