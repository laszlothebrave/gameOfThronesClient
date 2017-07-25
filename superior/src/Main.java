import main_pack.Game;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main (String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue(1);
        NetworkExample networkExample = new NetworkExample(queue);
        Game game = new Game(3, queue);
        GraphicExemple graphic = new GraphicExemple(queue);
        new Thread(networkExample).start();
        new Thread(graphic).start();
        new Thread(game).start();
    }
}
