package map_pack;

import exception_pack.*;
import main_pack.Player;

public class LocationList {
    private Location locationTab[];
    private int numberOfLocation;
    public LocationList(int size){
        locationTab = new Location[size];
        numberOfLocation = 0;
    }

    public int getSupplies(){
        int result = 0;
        for (Location location : locationTab){
            result += location.getSupplies();
        }
        return result;
    }

    public int getVictory() throws WinException {
        int result = 0;
        for (Location location : locationTab){
            result += location.getVictory();
        }
        if (result >= 7) throw new WinException(locationTab[1].getOwner());
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
}
