package design_pattern_selflearn.t05_Dectorator_Pattern.coffee_example;

// This is a concrete implementation of the Coffee interface.
// It represents a basic type of coffee without any added ingredients.
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee"; // Returns a basic description.
    }

    @Override
    public double cost() {
        return 1; // Returns the basic cost of a simple coffee.
    }
}