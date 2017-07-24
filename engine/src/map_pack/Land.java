package map_pack;

public class Land extends Location {
    private boolean isCapital;
    private int supplies;
    private int crown;
    private int castleStrength;
    private boolean isMark;

    Land(String name, boolean isStronghold, int supplice, int crown, int castleStrength, boolean isMarked) {
        super(name);
        this.isCapital = isStronghold;
        this.supplies = supplice;
        this.crown = crown;
        this.isMark = isMarked;
    }

    public int getSupplies(){
        return supplies;
    }

    public int getVictory(){
            return 1;
    }
}
