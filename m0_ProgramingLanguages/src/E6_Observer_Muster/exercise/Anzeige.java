package E6_Observer_Muster.exercise;

/*
* step3
* */
public class Anzeige implements IChatBeobachter {

    public Anzeige() {
    }

    @Override
    public void aktualisieren(Nachrichten nachrichten) {
        System.out.println("uhrzeit:  " + nachrichten.getUhrzeit() + " sender: " +
                nachrichten.getSender() + " empfaener: " + nachrichten.getEmpfaenger());
    }
}
