package design_pattern_selflearn.t04_Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        // one Subject
        Bank bank = new Bank();

        // several observer(这里利用了 polymorphism 多态， )
        //Customer alice = new Customer("Alice");
        Observer alice = new Customer("Alice");
        Observer bob = new Customer("Bob");

        Observer tom = new NonCustomer("Tom");

        // bank 把 Observer 装进去
        bank.addObserver(alice);
        bank.addObserver(bob);
        bank.addObserver(tom);


        bank.setInterestRate(2.5);
    }
}
