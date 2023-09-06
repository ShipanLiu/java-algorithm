package E5_Strategie_Muster.example;

public class Main {

    // class attribute

    public static void main(String[] args) {

        // get the current os
        boolean isWin = System.getProperty("os.name").startsWith("Windows");
        boolean isMac = System.getProperty("os.name").startsWith("Mac");
        boolean isLinux = System.getProperty("os.name").startsWith("Linux");

        // create a new Strategie 作为 Betriebssystem(context) 的参数
        Strategie myStrategie = null;

        if(isWin) {
            myStrategie = new WindowsStrategie();
        } else if(isMac) {
            myStrategie = new MacStrategie();
        } else if(isLinux) {
            myStrategie = new LinuxStrategie();
        }


        // create Betrisbssystem  <====  need a Strategie as parameter
        Betriebssystem bs = new Betriebssystem(myStrategie);

        System.out.println(bs); // use the toString method in Betriebssystem
    }

    // class method

    // inner class
}
