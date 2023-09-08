package E8_Proxy_Muster;

public class Main {
    public static void main(String[]  args) {
        ProxyInternetConnection proxyConnection = new ProxyInternetConnection(true);

        proxyConnection.connectToHost("google.com");

        proxyConnection.connectToHost("jier.com");


    }

}
