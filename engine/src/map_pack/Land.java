package map_pack;

public class Land extends Location {
    private boolean isCapital;
    private int supplies;
    private int crown;
    private int castleStrength;
    private boolean isMark;

    Land(LocationName locationName, int supplice, int crown, int castleStrength) {
        super(locationName);
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
