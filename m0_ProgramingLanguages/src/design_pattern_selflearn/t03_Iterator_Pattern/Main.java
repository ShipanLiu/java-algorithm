package design_pattern_selflearn.t03_Iterator_Pattern;

public class Main {
    public static void main(String[] args) {
        String[] items = {"jier1", "jier2", "jier3"};
        AggregateImpl aggregateImpl = new AggregateImpl(items);
        // items 本身不能直接创建 iterator， 必须通过 Aggregate 这个函数， 这个aggregate 相当于 zwischenstopp
        // aggregate 接受 items， 把 items 放进 createIterator 里面。
        Iterator iterator = aggregateImpl.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
