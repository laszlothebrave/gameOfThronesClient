package exception_pack;

public class NoPlayerGoldExeption extends Exception{
    public NoPlayerGoldExeption(){
        System.out.print("Not enough current gold\n");
    }
}
