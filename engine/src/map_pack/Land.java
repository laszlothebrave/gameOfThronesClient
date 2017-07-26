package map_pack;

public class Land extends Location {
    private boolean isCapital;
    private int supplies;
    private int areaGold;
    private int castleStrength;
    private boolean isMark;

    Land(LocationName locationName, int supplice, int areaGold, int castleStrength) {
        super(locationName);
        this.isCapital = false;
        this.supplies = supplice;
        this.areaGold = areaGold;
        this.isMark = false;
    }

    public int getSupplies(){
        return supplies;
    }

    public boolean hasVictoryPoint(){
            return (castleStrength>0);
    }
}
