package design_pattern_selflearn.t05_Dectorator_Pattern.coffee_example;

/*
* 这是 对 CoffeeDecorator 的具体实现： 这里实现加奶的 功能。
*
* */


// This is a concrete decorator which adds Milk to the coffee.
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee); // Call the parent constructor to initialize the component.
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk"; // Add "Milk" to the description of the component.
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Add cost for milk.
    }
}