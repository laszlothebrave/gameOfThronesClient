import java.util.concurrent.LinkedBlockingQueue;

public class GraphicExample implements Runnable{
    LinkedBlockingQueue queue;
    public GraphicExample(LinkedBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            printmessage();
        }
        System.out.print();
    }

    private void printmessage() {
        try {
            System.out.print(queue.take());
        } catch (InterruptedException e){

        }
    }
}
