

public class Client {
    public static void main(String[] args) {
        System.out.println("Client - OK");
        Network network = new Network();
        new Thread(network).start();
        Engine engine =  new Engine(network);
        new Thread(engine).start();
        new Thread(new Graphic(engine)).start();
    }
}
