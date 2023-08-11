package design_pattern_selflearn.t04_Observer_Pattern;

public class NonCustomer implements Observer{
    private String name;

    public NonCustomer(String name) {
        this.name = name;
    }

    @Override
    public void print(double interestRate) {
        System.out.println("Aktion! " +  name + " we have new interest rate: " + interestRate + "%");
    }
}
