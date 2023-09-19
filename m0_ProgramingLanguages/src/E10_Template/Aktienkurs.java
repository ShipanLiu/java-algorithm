package E10_Template;

import java.util.AbstractList;

/*
*
*   Use AbstractList (or even better, the List interface if you don't need any methods specific to AbstractList) if you want to make your class more flexible and extendable.
    Use a concrete class like ArrayList if you have specific needs that only that class can fulfill or if performance is a consideration.
    In many cases, unless you have a strong reason to use a specific concrete class, using an interface like List or an abstract class like AbstractList is often considered better practice.
*
* */

public class Aktienkurs {
    private AbstractList<Tageskurs> tageskurs;

    public Aktienkurs(AbstractList<Tageskurs> tageskurs) {
        this.tageskurs = tageskurs;
    }

}
