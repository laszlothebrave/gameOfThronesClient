package map_pack;

import java.util.ArrayList;
import java.util.HashMap;

public class NeighbourInitialization {

    private static HashMap<Area, ArrayList<Area>> neighbourHashMap;
    private static HashMap<AreaName,Area> areaHashMap;

    public static HashMap<Area,ArrayList <Area>> create(int numberOfPlayer, HashMap<AreaName,Area> areaHashMapOrginal){
        areaHashMap = areaHashMapOrginal;
        neighbourHashMap = new HashMap<>();
        add(AreaName.winterfell, new AreaName[] {AreaName.portWinterfell});

        return neighbourHashMap;
    }

    private static void add(AreaName key, AreaName[] neighbourTab){
        ArrayList<Area> areaArrayList = new ArrayList<>();
        for (AreaName neighbour : neighbourTab) {
            areaArrayList.add(areaHashMap.get(neighbour));
        }
        neighbourHashMap.put(areaHashMap.get(key), areaArrayList);
    }
}
