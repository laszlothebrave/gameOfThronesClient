import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkExample implements Runnable {

    private Scanner in;
    LinkedBlockingQueue networkToSuperior;
    LinkedBlockingQueue superiorToNetwork;

    public NetworkExample(LinkedBlockingQueue superiorToNetwork, LinkedBlockingQueue networkToSuperior){
        in = new Scanner(System.in);
        this.networkToSuperior = networkToSuperior;
        this.superiorToNetwork = superiorToNetwork;
    }

    @Override
    public void run(){
        while (true) {
            sendMessage();
            receiveMessage();
        }
    }

    private void receiveMessage() {
        try {
            System.out.print(superiorToNetwork.take() + " - message received by network form superior\n");
        } catch (InterruptedException e){

        }
    }

    private void sendMessage() {
        String a = in.nextLine();
        try {
            networkToSuperior.put(a + " - message send by network to superior\n");
        }catch (InterruptedException e){

        }
    }

}
