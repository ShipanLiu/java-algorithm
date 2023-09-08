package E8_Adapter_Muster;

/*
* step3
* */

public class DEAdresse implements AddressValidator{


    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        if(adresse.length() < 10) {
            return false;
        }
        if(plz.length() != 5) {
            return false;
        }
        if(bundesland.length() != 2) {
            return false;
        }

        return true;
    }
}
