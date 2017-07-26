package map_pack;

public class Sea extends Location {
    Sea(LocationName locationName) {
        super(locationName);
    }

    public int getSupplies(){
        return 0;
    }

    public boolean hasVictoryPoint(){
        return false;
    }
}
