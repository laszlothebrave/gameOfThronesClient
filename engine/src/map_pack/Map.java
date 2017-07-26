package map_pack;

import java.util.ArrayList;
import java.util.HashMap;

import static map_pack.AreaName.portWinterfell;

/**
 * graf lokacji z tablicą sąsiedztwa
 */

public class Map {
    AreaList areaList;
    HashMap<Area,ArrayList <Area>> neighbourHashMap;

    public Map(int numberOfPlayer){
        areaList = new AreaList(numberOfPlayer);
        neighbourHashMap = NeighbourInitialization.create(numberOfPlayer, areaList.getAreaHashMap());
    }

}
