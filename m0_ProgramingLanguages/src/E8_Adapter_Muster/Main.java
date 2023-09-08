package E8_Adapter_Muster;

public class Main {
    public static void main(String[] args) {
        AddressValidator validator = new DEAdresse();

        boolean valid = false;
        valid = validator.istGueltig("Universitaetsstr. 150", "44801", "NRW");
        System.out.println(valid);

        valid = validator.istGueltig("Universitaetsstr. 150", "44801", "NR");
        System.out.println(valid);

        validator = new USAddressAdapter();

        valid = validator.istGueltig("1600 Pennsylvania Ave NW, Washington", "20500", "DC");
        System.out.println(valid);

        /*
        *
        * DEAdresse 和 USAddressAdapter 是姐妹关系， 一个管 deutsche address， 一个管 us address
        *
        * */

    }
}
