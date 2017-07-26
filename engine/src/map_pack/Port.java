package map_pack;

public class Port extends  Location {
    Port(LocationName locationName) {
        super(locationName);
    }

    public int getSupplies(){
        return 0;
    }

    public boolean hasVictoryPoint(){
        return false;
    }
}
