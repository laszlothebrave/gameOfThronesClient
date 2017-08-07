package data_pack;

import data_pack.house_pack.House;
import data_pack.house_pack.HouseName;
import data_pack.*;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerList {

    private ArrayList <Player> playerList;
    private ArrayList <House> houseList;

    PlayerList(ArrayList<PlayerName> playerNameList){
        playerList = new ArrayList<>();
        for (int counter = 0; counter < playerNameList.size(); counter++){
            playerList.add(new Player(playerNameList.get(counter)));
        }
        SelectHouses();
    }

    private void SelectHouses() {

    }
}
