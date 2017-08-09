import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkExample implements Runnable {

    private Scanner in;
    LinkedBlockingQueue serverToClinet;
    LinkedBlockingQueue clientToServer;

    public NetworkExample(){
       serverToClinet = new LinkedBlockingQueue();
       clientToServer = new LinkedBlockingQueue();
    }

    @Override
    public void run(){
        while (true) {
            receiveMessage();
        }
    }

    private void receiveMessage() {
    }
}
