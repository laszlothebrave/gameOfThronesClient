import message_pack.CreateRoomMessage;

import java.util.concurrent.LinkedBlockingQueue;

public class Client {
    LinkedBlockingQueue superiorToNetwork;
    LinkedBlockingQueue networkToSuperior;


    public Client() {
        superiorToNetwork = new LinkedBlockingQueue(1);
        networkToSuperior = new LinkedBlockingQueue(1);
    }

    public void start(){
        createNetwork();
        listenToNetwork();
    }

    private void createNetwork(){
        NetworkExample networkExample = new NetworkExample(superiorToNetwork, networkToSuperior);
        new Thread(networkExample).start();
    }

    private void listenToNetwork(){
        while (true){
            receiveMessage();
            sendMessage();
        }
    }

    private void receiveMessage() {
        try {
            CreateRoomMessage message = (CreateRoomMessage)networkToSuperior.take();
            System.out.print( message.getRoomName() + " - message received by superior form network\n");
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
