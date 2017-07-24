package exception_pack;

import main_pack.Player;

public class WinException extends Exception{
    public Player Winner;

    public WinException(Player Winner){
        this.Winner = Winner;
    }
}
