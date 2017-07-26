import java.util.concurrent.LinkedBlockingQueue;

public class Server {
    LinkedBlockingQueue superiorToNetwork;
    LinkedBlockingQueue networkToSuperior;


    public Server() {
        superiorToNetwork = new LinkedBlockingQueue(1);
        networkToSuperior = new LinkedBlockingQueue(1);
    }

    public void start(){
        createNetwork();
        listenToNetwork();
    }

    private void listenToNetwork(){
        while (true){
            receiveMessage();
            sendMessage();
        }
    }

    private void createNetwork(){
        NetworkExample networkExample = new NetworkExample(superiorToNetwork, networkToSuperior);
        new Thread(networkExample).start();
    }

    private void receiveMessage() {
        try {
            Object message = networkToSuperior.take();
            System.out.print( message.toString() + " - message received by superior form network\n");
            interpretMessage(message);
        } catch (InterruptedException e){

        }

    }

    private void interpretMessage(Object message){}

    private void sendMessage() {
        try {
            superiorToNetwork.put("OK" + " - message send by network to superior");
        }catch (InterruptedException e){

        }
    }
}
