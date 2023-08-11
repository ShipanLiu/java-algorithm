package design_pattern_selflearn.t03_Iterator_Pattern;

public class IteratorImpl implements Iterator{

    private String[] items; // Items to iterate over
    private int position; // Current position in the iteration

    public IteratorImpl(String[] items) {
        this.items = items;
        this.position = 0;
    }




    @Override
    public boolean hasNext() {
        return position < items.length; //Return true if there are more items

    }

    @Override
    public Object next() {
        if(hasNext()) {
            return items[position++]; // Return next item and increment position
        } else {
            return null;
        }

    }
    
}
