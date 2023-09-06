package E5_Strategie_Muster.exercise;

public class PaypalStrategie implements Zahlungsstrategie{

   private String email;
   private String password;

    public PaypalStrategie(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void zahle(int preis) {
        System.out.println(preis + " wird bezahlt mit email " + email);
    }
}
