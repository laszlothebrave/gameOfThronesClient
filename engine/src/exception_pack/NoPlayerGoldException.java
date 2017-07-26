package exception_pack;

public class NoPlayerGoldException extends Exception{
    public NoPlayerGoldException(){
        System.out.print("No player gold available\n");
    }
}
