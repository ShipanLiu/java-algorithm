package design_pattern_selflearn.t03_Iterator_Pattern;

public class AggregateImpl implements Aggregate{

    //private attribute
    private String[] items;

    //constructor
    public AggregateImpl(String[] items) {
        this.items = items;
    }



    @Override
    public Iterator createIterator() {
        return new IteratorImpl(items);
    }
}
