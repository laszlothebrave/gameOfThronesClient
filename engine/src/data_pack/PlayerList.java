package data_pack;

import data_pack.house_pack.HouseName;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerList {

    static private HashMap <HouseName, Player> playerHashMap;

    PlayerList(ArrayList<PlayerName> playerNameList){

    }

    static public Player PlayerOfHouse (HouseName houseName) {
        return playerHashMap.get(houseName);
    }

    static public int getNumberOfPlayers () {
        return playerHashMap.size();
    }
}
