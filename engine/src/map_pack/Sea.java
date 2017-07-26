package map_pack;

public class Sea extends Area {
    Sea(AreaName areaName) {
        super(areaName);
    }

    public int getSupplies(){
        return 0;
    }

    public boolean hasVictoryPoint(){
        return false;
    }
}
