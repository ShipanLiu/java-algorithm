package design_pattern_selflearn.t01_Singleton_Pattern;


// Singleton pattern 双重检查锁定(double-checked locking)
public class Student03 {
    private String name;
    private int age;
    // "volatile":  to ensure that changes made to the instance are always visible to other threads.
    private volatile static Student03 instance;

    private Student03() {

    }

    public static Student03 getInstance() {
        if(instance == null) {
            // "Synchronization Block":  By synchronizing on the Student.class object,
            //      the method ensures that only one thread at a time can execute this block.
            //      This prevents multiple threads from creating multiple instances.
            synchronized (Student03.class) {
                if(instance == null) {
                    instance = new Student03();
                }
            }
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

// 问题： 为什么不用 lazy 里面的 用 synchronized 来修饰函数？

//    public static synchronized Student02 getInstance() {
//        if(instance == null) {
//            instance = new Student02();
//        }
//        return instance;
//    }

/*
* Using the synchronized keyword directly on the getInstance method, as you suggested,
*       can certainly provide thread safety. However, there are some trade-offs to consider
*
* tradeoff:(整个method 会被 lock 掉， 其他thread 不能 调用 getInstance 方法)
* The main downside of synchronizing the entire method is that it can lead to performance
*        issues in a multithreaded environment. When a method is synchronized,
*        only one thread can access it at a time. This means that every time a thread calls getInstance(),
*        it must acquire a lock on the Student class object. If the instance has already been created,
*        this synchronization is unnecessary but still incurs a performance cost.
*
*  double-checked locking pattern is more complex, but it offers a performance advantage:
    It only synchronizes the first time the instance is created. After that, threads can access the getInstance method without acquiring a lock.
    It reduces contention among threads, especially in applications where the getInstance method is called frequently.
*
* */