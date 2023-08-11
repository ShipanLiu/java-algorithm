package design_pattern_selflearn.t04_Observer_Pattern;


import java.util.ArrayList;
import java.util.List;

//Bank 是 subject， subject 要有一个 list， 里面存放所有的 observer
public class Bank {
    private List<Observer> observerList = new ArrayList<>(); // List of observers to be notified
    private double interestRate; // Interest rate that observers are watching, Bank 肯定要有自己的利率


    // Bank 要有 把 Observer 装进来的 方法
    public void addObserver(Observer ob) {
        observerList.add(ob);
    }

    public void setInterestRate(double value) {
        this.interestRate = value;
        //  你set完 之后，就要开始通知 observer 了
        notifyAllCustomers();

    }

    private void notifyAllCustomers() {
        for(Observer ob : observerList) {
            ob.print(interestRate);
        }
    }
}
