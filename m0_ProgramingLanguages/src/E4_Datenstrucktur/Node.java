package E4_Datenstrucktur;

/*
*
* for each node, you have 2 methods. insert + find
*
*
* */

// 声明 E 这个类型是 extends Comparable<E>, ===》 E 内部有 comapreTo 方法
public class Node<E extends Comparable<E>> {
    //  就是 规定了 Node 里盛放 E 类型的数据
    private Node<E> links, rechts; // 相当于 c语言里面的 struct
    private E value;

    public Node(E value) {
        this.value = value;
    }

    public void insertRekursiv(E newValue) {
        // newValue 可能是 animal， 可以不是 person，所以 不一定有 getId 这个方法，但是 我们保证 E 肯定是 implements Comparable 接口， 可以使用compareTo方法
        if(value.compareTo(newValue) < 0) {
            if(links != null) {
                // 假如 links 是存在的。
                links.insertRekursiv(newValue);
            } else {
                // 假如links 不存在， 则创建新的， 把 newPerson  wrap 到 一个Node 里面
                links = new Node<E>(newValue);
            }
        } else {
            if(rechts != null) {
                rechts.insertRekursiv(newValue);
            } else {
                rechts = new Node<E>(newValue);
            }
        }
    }

    public E findRekursiv(E obj) {
        // 退出 rekurdiv的节点
        if(value.compareTo(obj) == 0) {
            return value;
        } else if(value.compareTo(obj) < 0) {
            // 从左边找
            if(links != null) {
                return links.findRekursiv(obj);
            } else {
                return null;
            }
        } else {
            // 从右边找
            if(rechts != null) {
                return rechts.findRekursiv(obj);
            } else {
                return null;
            }
        }
    }

}
