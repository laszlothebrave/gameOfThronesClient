package map_pack;

public class Land extends Location {
    boolean isStronghold;
    int supplies;
    int crown;
    int castleStrength;
    boolean isMark;

    Land(String name, boolean isStronghold, int supplice, int crown, int castleStrength, boolean isMarked) {
        super(name);
        this.isStronghold = isStronghold;
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
