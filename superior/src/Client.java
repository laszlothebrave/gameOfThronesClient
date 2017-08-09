

public class Client {
    public static void main(String[] args) {
        NetworkExample networkExample = new NetworkExample();
        new Thread(networkExample).start();
        new Thread(new Engine(networkExample)).start();
    }

}
