package exception_pack;

public class InvalidOrderException extends Exception {
    public InvalidOrderException() {
        System.out.print("Wrong order\n");
    }
}
