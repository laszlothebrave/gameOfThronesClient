package message_pack;

import data_pack.PlayerName;

import java.io.Serializable;

public class AddNewPlayerMessage extends Message implements Serializable{
    AddNewPlayerMessage(PlayerName playerName) {
        super(playerName);
    }
}
