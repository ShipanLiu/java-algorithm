package design_pattern_selflearn.t02_Strategy_Pattern.example_payment;

/*step 4:  开始应用*/
public class Main {
    public static void main(String[] args) {
        // 默认的是 用credit cart
        ShoppingCart cart = new ShoppingCart(new PaymentStrategyCreditCardImpl());
        cart.checkout(100);

        cart.setPaymentStrategy(new PaymentStrategyPaypalImpl());
        cart.checkout(1000);

    }
}
