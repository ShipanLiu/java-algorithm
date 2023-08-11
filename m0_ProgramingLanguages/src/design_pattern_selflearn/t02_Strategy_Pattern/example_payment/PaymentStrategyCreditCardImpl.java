package design_pattern_selflearn.t02_Strategy_Pattern.example_payment;

public class PaymentStrategyCreditCardImpl implements PaymentStrategy{

    // 这个 Override 你可以省略， 但是 这个 Override 对 Compiler 有好处
    @Override
    public void pay(int amount) {
        System.out.println("paid " + amount + " using Credit Card");
    }
}
