package map_pack;

import exception_pack.*;
import main_pack.Player;

import java.util.HashMap;
import java.util.Map;

public class LocationList {

    private HashMap<LocationName,Location> locationHashMap;

    public LocationList(int numberOfPlayer){
        locationHashMap = LocationInitialization.create(numberOfPlayer);
    }

    public int getSupplies(){
        int result = 0;
        for (Map.Entry<LocationName, Location> entry : locationHashMap.entrySet()){
            result += entry.getValue().getSupplies();
        }
        return result;
    }

    public int getVictory() throws VictoryException {
        int result = 0;
        for (Map.Entry<LocationName, Location> entry : locationHashMap.entrySet()){
            result += entry.getValue().getVictory();
        }
        if (result >= 7) throw new VictoryException(locationTab[1].getOwner());
        return result;
    }

    public void addLocation(Location location, Player newOwner){
        location.setOwner(newOwner);
        locationTab[numberOfLocation] = location;
        numberOfLocation++;
    }

    public void substractLocation(Location location) throws LocationNotFoundException{
        int position = findLocation(location);
        numberOfLocation--;
        locationTab[position] = locationTab[numberOfLocation];
    }

    private int findLocation(Location location) throws LocationNotFoundException{
        int position = 0;
        for (Location tmp : locationTab){
            if (tmp == location) return position;
            position++;
        }
        throw new LocationNotFoundException(location);
    }

    public HashMap<LocationName, Location> getLocationHashMap() {
        return locationHashMap;
    }
}
