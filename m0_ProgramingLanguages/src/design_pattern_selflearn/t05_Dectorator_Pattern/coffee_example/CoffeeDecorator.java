package design_pattern_selflearn.t05_Dectorator_Pattern.coffee_example;

/*
* 我们要对 Coffee 进行 功能 扩展， 所以这里有了 CoffeeDecorator
*
* */

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee; // This represents the component that we are decorating.

    // Constructor to initialize the coffee component.
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription(); // Default behavior is to delegate to the component.
    }

    @Override
    public double cost() {
        return coffee.cost(); // Default behavior is to delegate to the component.
    }
}
