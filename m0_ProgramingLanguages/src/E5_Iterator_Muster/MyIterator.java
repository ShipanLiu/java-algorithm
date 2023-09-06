package E5_Iterator_Muster;
import java.util.Iterator;
/*
* step0
*
*
* interface Iterator 是 在 java.util.Iterator 的基础上的扩展。， 加上自己的 方法 peek  和  previous
* */
/*
*
* 为什么是 extend？ 因为 MyIterator 是 interface， Iterator 也是 interface
*The <Node> syntax is a generic type parameter, which allows you to work with a collection of Node objects in a type-safe manner.
* */

public interface MyIterator extends Iterator<Node> {
    Node peek();
    Node previous();
}
