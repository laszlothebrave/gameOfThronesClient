package message_pack;

import data_pack.house_pack.HouseName;
import data_pack.PlayerName;

import java.io.Serializable;
import java.util.ArrayList;

public class AssignHousePreferenceMessage extends Message implements Serializable{
    public ArrayList<HouseName> HousePreferenceList;

    AssignHousePreferenceMessage(PlayerName playerName) {
        super(playerName);
        HousePreferenceList = new ArrayList <HouseName>();
    }

    public void addHouse (HouseName house){
        HousePreferenceList.add(house);
    }

    public void switchHouse (int houseOne, int houseTwo){
        HouseName tmp = HousePreferenceList.get(houseOne);
        HousePreferenceList.set(houseOne, HousePreferenceList.get(houseTwo));
        HousePreferenceList.set(houseTwo, tmp);
    }
}