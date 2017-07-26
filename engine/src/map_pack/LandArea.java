package map_pack;

public class LandArea extends Area {
    private boolean isCapital;
    private int supplies;
    private int crown;
    private int castleStrength;
    private boolean isMark;

    LandArea(AreaName areaName, int supplice, int crown, int castleStrength) {
        super(areaName);
        this.isCapital = false;
        this.supplies = supplice;
        this.crown = crown;
        this.isMark = false;
    }

    public int getSupplies(){
        return supplies;
    }

    public int getVictory(){
        return 1;
    }
}
