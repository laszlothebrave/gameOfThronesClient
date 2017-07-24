package house_pack;

import map_pack.*;
import military_pack.LeaderList;

public class House {
    int suppliesPath;
    int victoryPath;
    Location locationList;
    LeaderList leaderList;

    public House(int suppliesPath, int victoryPath){
        this.suppliesPath = suppliesPath;
        this.victoryPath = victoryPath;
    }

    public void updateSuppliesPath(){
        suppliesPath = locationList.getSupplies();
    }

    public void updateVictoryPath(){
        victoryPath = locationList.getVictory();
    }

    public void addLocation(Location location){
        locationList.addLocation(location);
    }
}
