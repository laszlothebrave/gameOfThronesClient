package map_pack;

import java.util.ArrayList;
import java.util.HashMap;

import static map_pack.LocationName.portWinterfell;

/**
 * graf lokacji z tablicą sąsiedztwa
 */

public class Map {
    LocationList locationList;
    HashMap<Location,ArrayList <Location>> neighbourHashMap;

    public Map(int numberOfPlayer){
        locationList = new LocationList(numberOfPlayer);
        neighbourHashMap = NeighbourInitialization.create(numberOfPlayer, locationList.getLocationHashMap());
    }

}
