package exception_pack;

public class NoBankGoldException extends Exception{
    public NoBankGoldException() {
         System.out.print("No bank gold available\n");
    }
}
