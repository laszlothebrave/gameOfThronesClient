package exception_pack;

import main_pack.Player;

public class WinException extends Exception{
    public Player Winner;

    public WinException(Player Winner){
        System.out.print("Winner is " + Winner.getPlayerName() + "of house " + Winner.getHouse().getHouseName().getName());
        this.Winner = Winner;
    }

    public Player getWinner() {
        return Winner;
    }

}
