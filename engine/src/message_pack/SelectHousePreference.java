package message_pack;

import house_pack.House;
import house_pack.HouseName;
import main_pack.PlayerName;

import java.io.Serializable;
import java.util.ArrayList;

public class SelectHousePreference extends Message implements Serializable{
    public ArrayList<HouseName> HousePreferenceList;

    SelectHousePreference(PlayerName player) {
        super(player);
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