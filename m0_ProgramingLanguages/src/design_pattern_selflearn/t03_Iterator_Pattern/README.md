# Iterator Pattern

1. The Iterator Pattern is a behavioral design pattern that __provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation__. It encapsulates the details of iteration and allows clients to traverse through the elements of a collection without knowing its underlying structure.

## step1-Create Iterator Interface

```
public interface Iterator {
boolean hasNext(); // Method to check if there is a next element
Object next();     // Method to retrieve the next element
}
```





