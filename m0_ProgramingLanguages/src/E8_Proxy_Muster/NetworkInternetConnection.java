package E8_Proxy_Muster;

public class NetworkInternetConnection implements InternetConnection{


    @Override
    public void connectToHost(String host) {
        System.out.println("connected to host: " + host);
    }
}
