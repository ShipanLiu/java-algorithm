package E5_Strategie_Muster.exercise;

public interface Zahlungsstrategie {
    /*In Java, all methods in an interface are implicitly public and abstract*/
    // 这里直接 省略了 public
    void zahle(int preis);
}
