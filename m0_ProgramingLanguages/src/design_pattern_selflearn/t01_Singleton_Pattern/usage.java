package design_pattern_selflearn.t01_Singleton_Pattern;

public class usage {
    public static void main(String[] args) {
        // the Eager
        Student01 student01 = Student01.getInstance();
        student01.setName("stu01");
        student01.setAge(25);
        System.out.println("name: " + student01.getName() + " age: " + student01.getAge());

        System.out.println("############################");

        // Lazy
        Student02 student02 = Student02.getInstance();
        student02.setName("stu02");
        student02.setAge(26);
        System.out.println("name: " + student02.getName() + " age: " + student02.getAge());

        System.out.println("############################");

        // Lazy
        Student03 student03 = Student03.getInstance();
        student03.setName("stu03");
        student03.setAge(27);
        System.out.println("name: " + student03.getName() + " age: " + student03.getAge());

        System.out.println("############################");


        // Lazy
        Student04 student04 = Student04.getInstance();
        student04.setName("stu04");
        student04.setAge(28);
        System.out.println("name: " + student04.getName() + " age: " + student04.getAge());

        System.out.println("############################");
    }
}


