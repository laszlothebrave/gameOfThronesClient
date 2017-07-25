package map_pack;

import java.util.ArrayList;
import java.util.HashMap;

public class NeighbourInitialization {

    private static HashMap<Location, ArrayList<Location>> neighbourHashMap;
    private static HashMap<LocationName,Location> locationHashMap;

    public static HashMap<Location,ArrayList <Location>> create(int numberOfPlayer, HashMap<LocationName,Location> locationHashMapOrginal){
        locationHashMap = locationHashMapOrginal;
        neighbourHashMap = new HashMap<>();
        add(LocationName.winterfell, new LocationName[] {LocationName.portWinterfell});

        return neighbourHashMap;
    }

    private static void add(LocationName key, LocationName[] neighbourTab){
        ArrayList<Location> locationArrayList = new ArrayList<>();
        for (LocationName neighbour : neighbourTab) {
            locationArrayList.add(locationHashMap.get(neighbour));
        }
        neighbourHashMap.put(locationHashMap.get(key), locationArrayList);
    }
}
