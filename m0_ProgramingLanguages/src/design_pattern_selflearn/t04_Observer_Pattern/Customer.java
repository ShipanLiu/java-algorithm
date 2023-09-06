package design_pattern_selflearn.t04_Observer_Pattern;


/*
* step2:  implement Observer， 谁是 Observer
* */
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
