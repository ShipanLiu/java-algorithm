package design_pattern_selflearn.t01_Singleton_Pattern;


//Singleton pattern ---- 静态内部类( Initialization-on-demand holder idiom)
public class Student04 {
    private String name;
    private int age;

    private Student04() {

    }

    /*
    *
    * This approach leverages Java's class-loading mechanism
    *       to ensure that the instance is created lazily and is also thread-safe
    * Since it's an inner static class, it will only be loaded when it is referenced,
    *        and the instance will be created at that time
    * final ensures that the instance cannot be modified once it's created.
    * */

    private static class Holder {
        private static final Student04 instance = new Student04();
    }
    /*
    * When this method is called, it references the instance field of the Holder class.
    *       This triggers the class loader to load the Holder class, which in turn initializes
    *       the instance field. Since class loading is thread-safe, this ensures that only one
    *       instance of the Student class is created, even in a multithreaded environment.
    *
    * 就是利用了 class loading is thread-safe， 利用了 java 自带的性质， 不懂自己去 上锁。
    * */

    public static Student04 getInstance() {
        return Holder.instance;
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
