package E4_Datenstrucktur;

import java.util.Random;

public class Person implements Comparable<Person>{

    private String name;
    private int id;

    private static final int MAX_RAND_ID = 1000;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
        this.id = new Random().nextInt(MAX_RAND_ID);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return id - anotherPerson.getId();
    }
}