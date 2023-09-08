package E8_Adapter_Muster;

public class USAddressAdapter extends USAddress implements AddressValidator{

    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        return super.isValidUSAddress(adresse, plz, bundesland);
    }
}
