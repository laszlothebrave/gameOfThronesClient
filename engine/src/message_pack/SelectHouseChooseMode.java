package message_pack;

import main_pack.PlayerName;

import java.io.Serializable;

public class SelectHouseChooseMode extends Message implements Serializable{
    private ChooseMode HouseChooseMode;

    public SelectHouseChooseMode(PlayerName player, ChooseMode chooseMode){
        super(player);
        this.HouseChooseMode = chooseMode;
    }

    public ChooseMode getHouseChooseMode() {
        return HouseChooseMode;
    }
}