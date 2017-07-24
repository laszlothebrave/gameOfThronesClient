package exception_pack;

import map_pack.Location;

public class LocationNotFoundException extends Exception{
    public Location location;

    public LocationNotFoundException(Location location){
        this.location = location;
    }
}
