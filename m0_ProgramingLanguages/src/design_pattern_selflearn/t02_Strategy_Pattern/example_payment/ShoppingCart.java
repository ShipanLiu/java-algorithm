package design_pattern_selflearn.t02_Strategy_Pattern.example_payment;

/*step3： 定义应用的场景（context）*/

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // constructor
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 指定paymentStrategy， 需要setter 方法
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // class methods, 使用当前class 的 paymentStrategy 来 checkout
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }



}
