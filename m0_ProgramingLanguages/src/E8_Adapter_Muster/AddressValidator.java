package E8_Adapter_Muster;

/*
* step2:  AddressValidator
* */

public interface AddressValidator {
    public boolean istGueltig(String adresse, String plz, String bundesland);
}
