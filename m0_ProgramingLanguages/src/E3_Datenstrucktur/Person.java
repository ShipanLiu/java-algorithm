package E3_Datenstrucktur;

public class Person {

    private String name;
    private int id;

    private static final int MAX_RAND_ID = 1000;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}