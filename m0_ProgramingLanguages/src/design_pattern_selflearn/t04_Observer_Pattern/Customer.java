package design_pattern_selflearn.t04_Observer_Pattern;

public class Customer implements Observer{

    String name;

    public Customer(String name) {
        this.name = name;
    }


    @Override
    public void print(double interestRate) {
        System.out.println(name + " is notified, new interest rate: " + interestRate + "%");
    }
}
