package E5_Iterator_Muster;

/*
* step 2
* */

public class Node {
    private Node links, rechts;
    private Person person;

    public Node(Person p) {
        this.person = p;
    }

    public Node getLinks() {
        return links;
    }

    public Node getRechts() {
        return rechts;
    }

    public void insertRecursive(Person newPerson) {
        if(newPerson.getId() < person.getId()) {
            if(links != null) {
                links.insertRecursive(newPerson);
            } else {
                // 这是exit 的出口
                links = new Node(newPerson);
            }
        } else {
            if(rechts != null) {
                rechts.insertRecursive(newPerson);
            } else {
                rechts = new Node(newPerson);
            }
        }
    }

    public Person findRecursive(int id) {
        // if match current node
        if(person.getId() == id) {
            return person;
        } else if(id < person.getId()) {
            if(links != null) {
                return links.findRecursive(id);
            } else {
                // does not exist
                return null;
            }
        } else {
            if(rechts != null) {
                return rechts.findRecursive(id);
            } else {
                return null;
            }
        }
    }

    @Override
    public String toString() {
        return person.getName() +" with id " + person.getId();
    }
}
