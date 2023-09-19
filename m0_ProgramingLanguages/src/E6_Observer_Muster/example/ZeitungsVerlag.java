package E6_Observer_Muster.example;

import java.util.ArrayList;
import java.util.Date;

/*
* step 4
*
* */


public class ZeitungsVerlag {
    // define a list of Observer
    private ArrayList<IAbonent> list = new ArrayList<>();


    //假如你忘记加上 无参的 constructor 的话，Java会 自动给你加上
    public ZeitungsVerlag() {}

    // add observer into list
    public void addObserver(IAbonent observer) {
        if(!list.contains(observer)) {
            list.add(observer);
        } else {
            System.out.println("this observer is already in our list");
        }
    }

    // delete observer from list
    public void removeObserver(IAbonent observer) {
        if(list.contains(observer)) {
            list.remove(observer);
        } else {
            System.out.println("the to be removed observer does not exist");
        }
    }

    // notify all obervers
    public void notifyAllObervers(Zeitung zeitung) {
        // loop the list
        for(IAbonent observer : list) {
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
