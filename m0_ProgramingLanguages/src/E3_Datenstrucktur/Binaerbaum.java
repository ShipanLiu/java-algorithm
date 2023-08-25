package E3_Datenstrucktur;

/*
* Binaerbaum 的组成部分 就是 node
*
*
*
* */

public class Binaerbaum {

    private Node wurzelknoten;

    /*insert node into tree  -->   actually you use the method insertRekursiv() from Node */
    public void insert(Person person) {
        // wrap the node into a person
        if(wurzelknoten == null) {
            wurzelknoten = new Node(person);
        } else {
            // insert into the tree
            wurzelknoten.insertRekursiv(person);
        }
    }

    public Person find(int id) {
        if(wurzelknoten == null) {
            //  the tree is empty
            return null;
        } else {
            return wurzelknoten.findRekursiv(id);
        }
    }

}
