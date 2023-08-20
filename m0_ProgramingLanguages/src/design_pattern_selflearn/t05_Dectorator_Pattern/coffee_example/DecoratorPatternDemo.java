package design_pattern_selflearn.t05_Dectorator_Pattern.coffee_example;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee(); // Create a simple coffee.
        System.out.println(coffee.getDescription() + " Cost: " + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee()); // Decorate the simple coffee with milk.
        System.out.println(milkCoffee.getDescription() + " Cost: " + milkCoffee.cost());

        // Decorate the simple coffee with both milk and sugar.
        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + " Cost: " + sugarMilkCoffee.cost());
    }
}


//        Simple Coffee Cost: 1.0
//        Simple Coffee, Milk Cost: 1.5
//        Simple Coffee, Milk, Sugar Cost: 1.7