package E5_Strategie_Muster.exercise;

public class Main {
    // I need to use WarenKorb -->  WarenKord need a Zahlungsstrategie as parameter
    public static void main(String[] args) {

        Zahlungsstrategie zahlKredit = new KreditkartenStrategie("SHIPAN LIU",
                                    "1234", "099", "07/2050");

        WarenKorb warenKorb = new WarenKorb(null);

        warenKorb.zahle(100);

        // zahlung 失败之后 ----> 重新设置 Zahlungsstrategie
        System.out.println("let's try again using paypal");



        warenKorb.setZahlStra(new PaypalStrategie("liushipan1998@gmail.com",
                                                                 "111"));

        warenKorb.zahle(100);


        warenKorb.setZahlStra(zahlKredit);
        warenKorb.zahle(999);

    }


}
