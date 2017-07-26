package map_pack;

public class Port extends  Area {
    Port(AreaName areaName) {
        super(areaName);
    }

    public int getSupplies(){
        return 0;
    }

    public boolean hasVictoryPoint(){
        return false;
    }
}
