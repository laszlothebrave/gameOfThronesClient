import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkExample implements Runnable {

    private Scanner in;
    LinkedBlockingQueue queue;


    public NetworkExample(LinkedBlockingQueue queue){
        in = new Scanner(System.in);
        this.queue = queue;
    }

    @Override
    public void run(){
        while (true) {
            getMessage();
        }
    }

    private void getMessage() {
        String a = in.nextLine();
        try {
            queue.put(a);
        }catch (InterruptedException e){

        }
    }

}
