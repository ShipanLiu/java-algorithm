package E3_Datenstrucktur;

/*
*
* for each node, you have 2 methods. insert + find
*
*
* */

public class Node {
    private Node links, rechts; // 相当于 c语言里面的 struct
    private Person person;

    public Node(Person p) {
        this.person = p;
    }

    public void insertRekursiv(Person newPerson) {
        if(newPerson.getId() <= person.getId()) {
            if(links != null) {
                // 假如 links 是存在的。
                links.insertRekursiv(newPerson);
            } else {
                // 假如links 不存在， 则创建新的， 把 newPerson  wrap 到 一个Node 里面
                links = new Node(newPerson);
            }
        } else {
            if(rechts != null) {
                rechts.insertRekursiv(newPerson);
            } else {
                rechts = new Node(newPerson);
            }
        }
    }

    public Person findRekursiv(int id) {
        // 退出 rekurdiv的节点
        if(person.getId() == id) {
            return person;
        } else if(id < person.getId()) {
            // 从左边找
            if(links != null) {
                return links.findRekursiv(id);
            } else {
                return null;
            }
        } else {
            // 从右边找
            if(rechts != null) {
                return rechts.findRekursiv(id);
            } else {
                return null;
            }
        }
    }

}
