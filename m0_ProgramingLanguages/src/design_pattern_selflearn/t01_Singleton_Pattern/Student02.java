package design_pattern_selflearn.t01_Singleton_Pattern;


// 懒汉式(Lazy Initialization)
public class Student02 {
    private String name;
    private int age;

    // you use static, means "instance" belongs to this class, but not some external instance
    private static Student02 instance;

    private Student02() {

    }

    // static: Since the method is static, it belongs to the class itself and not to any
    //      specific instance of the class. This allows the method to be called without
    //      creating an instance of the class.
    // synchronized: This keyword ensures that only one thread can execute the method at a time.
    //      In a "multithreaded" environment, this prevents multiple threads from creating multiple
    //      instances of the singleton.

    public static synchronized Student02 getInstance() {
        if(instance == null) {
            instance = new Student02();
        }
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
