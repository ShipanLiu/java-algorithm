package design_pattern_selflearn.t02_Strategy_Pattern.example_payment;

//Step1 -->  创建一个interface， 里面包含 变化的 method
/*
* Create an interface that will be implemented by all concrete strategies.
* This interface defines a method that encapsulates the behavior that varies.
* */


public interface PaymentStrategy {
    // why don't use public?
    // the public modifier is redundant. Since all methods in an interface are inherently public, you don't need to
    void pay(int amount);
}
