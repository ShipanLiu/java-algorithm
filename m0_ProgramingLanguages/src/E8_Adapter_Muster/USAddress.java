package E8_Adapter_Muster;

/*
* step1
*  this class works good for us address and We want to use the existing functionality for deutsche Adresse.
* */

public class USAddress {
    public boolean isValidUSAddress(String address, String zip, String state) {
        if(address.length() < 10) {
            return false;
        }
        if(zip.length() < 5 || zip.length() > 10) {
            return false;
        }
        if(state.length() != 2) {
            return false;
        }
        return true;
    }
}
