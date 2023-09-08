package E8_Proxy_Muster;

import com.sun.tools.jconsole.JConsoleContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProxyInternetConnection implements InternetConnection{
    private boolean useWhitelist;
    // as a proxy, I have access to the rea; class
    private InternetConnection connection;

    private List<String> whitelist, blacklist;


    public ProxyInternetConnection(boolean useWhitelist) {
        this.useWhitelist = useWhitelist;
        connection = new NetworkInternetConnection();
        // read the white/black list
        try {
            whitelist = Files.readAllLines(Path.of("whitelist.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            blacklist = Files.readAllLines(Path.of("blacklist.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void connectToHost(String host) {

        if(useWhitelist) {
            if(whitelist.contains(host)) {
                connection.connectToHost(host);
            }else {
                System.out.println(host + " is not in whitelist");
            }
        } else {
            // black list
            if(!blacklist.contains(host)) {
                connection.connectToHost(host);
            }else {
                System.out.println(host + " is in blacklist");
            }
        }
    }
}
