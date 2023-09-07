package E6_Observer_Muster.example;

import java.util.ArrayList;
import java.util.Date;

/*
* step 4
*
* */


public class ZeitungsVerlag {
    // define a list of Observer
    private ArrayList<Observer> list = new ArrayList<>();

    // add observer into list
    public void addObserver(Observer observer) {
        if(!list.contains(observer)) {
            list.add(observer);
        } else {
            System.out.println("this observer is already in our list");
        }
    }

    // delete observer from list
    public void removeObserver(Observer observer) {
        if(list.contains(observer)) {
            list.remove(observer);
        } else {
            System.out.println("the to be removed observer does not exist");
        }
    }

    // notify all obervers
    public void notifyAllObervers(Zeitung zeitung) {
        // loop the list
        for(Observer observer : list) {
            observer.erhalteZeitung(zeitung);
        }
    }

    // Zeitung update operation
    public void foundNewZeitung(String title) {
        Zeitung newZeitung = new Zeitung(new Date(),title);
        // now notify
        notifyAllObervers(newZeitung);
    }

}
