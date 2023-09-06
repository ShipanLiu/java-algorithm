package E4_Datenstrucktur;

public class Main {
    public static void main(String[] args) {
        // create some person
        Person p1 = new Person("jier1");
        Person p2 = new Person("jier2");
        Person p3 = new Person("jier3");
        Person p4 = new Person("jier4");

        System.out.println(p1.getName() + ": " + p1.getId());
        System.out.println(p2.getName() + ": " + p2.getId());
        System.out.println(p3.getName() + ": " + p3.getId());
        System.out.println(p4.getName() + ": " + p4.getId());

        // insert into Binarytree(create + insert)
        Binaerbaum<Person> tree = new Binaerbaum<>();

        tree.insert(p1);
        tree.insert(p2);
        tree.insert(p3);
        tree.insert(p4);

        // search from binarytree
        Person target = tree.find(p1);
        System.out.println(target.getName() + "--" + target.getId());
    }
}
