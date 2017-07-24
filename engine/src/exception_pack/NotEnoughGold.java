package exception_pack;

public class NotEnoughGold extends Exception{
    public boolean isCurrent;
    public NotEnoughGold (boolean isCurrent){
        this.isCurrent = isCurrent;
        if (isCurrent) System.out.print("Not enough current gold\n");
        else System.out.print("Not enough available gold\n");
    }
}
