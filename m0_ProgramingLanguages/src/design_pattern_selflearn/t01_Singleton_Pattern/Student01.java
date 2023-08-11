package design_pattern_selflearn.t01_Singleton_Pattern;


// 饿汉式(Eager Initialization)
public class Student01 {
    private String name;
    private int age;

    // this is a core part of "懒汉式"  sigleton pattern
    // private: This keyword ensures that the instance variable is not accessible from outside the class
    // static: This keyword means that the variable belongs to the class itself rather than to instances
    //       of the class. This ensures that there's only one copy of the variable across all instances of the class,
    //       making it possible to have a single shared instance of the Student class
    // final: This keyword ensures that the value assigned to the instance variable cannot be changed
    //      once it's set. This is crucial for the singleton pattern, as it guarantees that the instance
    //      will remain the same throughout the lifetime of the application.
    private static final Student01 instance = new Student01();

    private Student01() {

    }

    // there is no constructors with parameters: because if so,then multiple instance will be created,
    // but The singleton pattern's purpose is to ensure that a class has only one instance and to provide a global point of access to that instance.
    // 问题是 在 multithreading 中 不适用，没有 synchronized
    public static Student01 getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
