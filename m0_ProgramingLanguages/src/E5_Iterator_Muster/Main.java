package E5_Iterator_Muster;

import java.util.ArrayList;

/*
*
* step5
*
* */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArr = new ArrayList<>();
        personArr.add(new Person("jier1", 1));
        personArr.add(new Person("jier2", 2));
        personArr.add(new Person("jier3", 3));
        personArr.add(new Person("jier4", 4));
        personArr.add(new Person("jier5", 5));
        personArr.add(new Person("jier6", 6));
        personArr.add(new Person("jier7", 7));
        personArr.add(new Person("jier8", 8));
        personArr.add(new Person("jier9", 9));
        personArr.add(new Person("jier10", 10));
        personArr.add(new Person("jier11", 11));

        // create the tree
        Binaerbaum tree = new Binaerbaum();

        for(Person p : personArr) {
            tree.insert(p);
        }

        int targetId = 8;

        Person targetPerson = tree.find(targetId);

        if(targetPerson != null){
            System.out.println(targetPerson.getId() + " : " + targetPerson.getName());
        } else {
            System.out.println(targetId + "can not be found");
        }

        /*
        * 现在开始进行Iterator 的测试
        *
        * */

        BinaryTreeIterator dfsIterator = tree.createDFSIterator();

        // 遍历 使用DFS 的 方式
        while(dfsIterator.hasNext()) {
            Node node = dfsIterator.next();
            System.out.println(node.toString());
        }

        System.out.println("previous");

        System.out.println(dfsIterator.previous());
        System.out.println(dfsIterator.previous());

        System.out.println("loop again");
        // 遍历 使用DFS 的方式 再次遍历
        while(dfsIterator.hasNext()) {
            Node node = (Node) dfsIterator.next();
            System.out.println(node.toString());
        }

    }


}
