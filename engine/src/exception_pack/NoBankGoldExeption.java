package exception_pack;

public class NoBankGoldExeption extends Exception{
    public NoBankGoldExeption() {
         System.out.print("Not enough available gold\n");
    }
}
