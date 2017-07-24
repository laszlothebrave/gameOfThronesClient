package house_pack;

import exception_pack.WinException;
import map_pack.*;
import military_pack.LeaderList;

public class House {
    private HouseName name;
    private int suppliesPath;
    private int victoryPath;
    private LocationList locationList;
    private LeaderList leaderList;

    public House(int suppliesPath, int victoryPath, HouseName name){
        this.suppliesPath = suppliesPath;
        this.victoryPath = victoryPath;
        this.name = name;
    }

    public void updateSuppliesPath(){
        suppliesPath = locationList.getSupplies();
    }

    public void updateVictoryPath() throws WinException {
        victoryPath = locationList.getVictory();
    }

    public HouseName getName() {
        return name;
    }

    public LocationList getLocationList() {
        return locationList;
    }

    public LeaderList getLeaderList() {
        return leaderList;
    }

}
