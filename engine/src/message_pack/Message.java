package message_pack;

import data_pack.*;

public abstract class Message {
    PlayerName playerName;

    public Message (PlayerName playerName){
        this.playerName = playerName;
    }

    public PlayerName getPlayerName() {
        return playerName;
    }
}
