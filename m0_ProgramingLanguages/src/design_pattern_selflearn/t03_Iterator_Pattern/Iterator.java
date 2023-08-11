package design_pattern_selflearn.t03_Iterator_Pattern;


// step1: Create Iterator Interface
public interface Iterator {
    boolean hasNext(); // Method to check if there is a next element
    Object next();  // Method to retrieve the next element, 因为你不知道是什么类型 ==》 所以 Object
}
