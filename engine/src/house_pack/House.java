package house_pack;

import exception_pack.VictoryException;
import map_pack.*;
import military_pack.LeaderList;

public abstract class House {
    private HouseName houseName;
    private int supplyTrack;
    private int victoryTrack;
    private LocationList locationList;
    private LeaderList leaderList;

    public House(int suppliesTrack, int victoryPath, HouseName name){
        this.supplyTrack = suppliesTrack;
        this.victoryTrack = victoryPath;
        this.houseName = name;
    }

    public void updateSupplyTrack(){
        supplyTrack = locationList.getSupplies();
    }

    public void updateVictoryTrack() throws VictoryException {
        victoryTrack = locationList.getVictory();
    }

    public HouseName getHouseName() {
        return houseName;
    }

    public LocationList getLocationList() {
        return locationList;
    }

    public LeaderList getLeaderList() {
        return leaderList;
    }

}
