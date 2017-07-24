package map_pack;

import java.util.ArrayList;

public class LocationInitialization {
    private static ArrayList <Location> locationList;

    public static ArrayList<Location> create(int numberOfPlayers){
        int numberOfLocation;
        locationList = new ArrayList<Location>();
        if (numberOfPlayers >= 3) {
            locationList.add(new Land("Czarny zamek", false, 0, 1, 0, false));
            locationList.add(new Land("Karhold", false, 0, 1, 0, false));

        }
        if (numberOfPlayers >= 4) {

        }
        if (numberOfPlayers >= 5) {

        }
        if (numberOfPlayers >= 6) {

        }
        return locationList;
    }
}
