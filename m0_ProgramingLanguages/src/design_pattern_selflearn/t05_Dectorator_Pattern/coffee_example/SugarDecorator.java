package design_pattern_selflearn.t05_Dectorator_Pattern.coffee_example;

// This is another concrete decorator which adds Sugar to the coffee.
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee); // Call the parent constructor to initialize the component.
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar"; // Add "Sugar" to the description of the component.
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.2; // Add cost for sugar.
    }
}