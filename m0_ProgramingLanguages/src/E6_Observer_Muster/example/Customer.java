package E6_Observer_Muster.example;

/*
* step 3
*
* */


public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println(name + " have received the newspaper " + zeitung.getTitle() + " am " + zeitung.getDate());
    }
}
