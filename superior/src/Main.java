import main_pack.Game;

import java.io.Serializable;

public class Main {
    public static void main (String[] args) {
        Server server = new Server();
        server.listenToNetwork();
    }
}
