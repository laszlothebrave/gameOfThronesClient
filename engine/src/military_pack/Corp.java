package military_pack;

public class Corp {
    private int Infantry;
    private int Cavalry;
    private int Ship;
    private int Tower;

    public Corp (int Infantry, int Cavalry, int Ship, int Tower){
        this.Infantry = Infantry;
        this.Cavalry = Cavalry;
        this.Ship = Ship;
        this.Tower = Tower;
    }

    public void addSoldier(int Infantry, int Cavalry, int Ship, int Tower){
        this.Infantry += Infantry;
        this.Cavalry += Cavalry;
        this.Ship += Ship;
        this.Tower += Tower;
    }

    public boolean substractSoldier(int Infantry, int Cavalry, int Ship, int Tower){
        if (isAvailable(Infantry, Cavalry, Ship, Tower)) {
            this.Infantry -= Infantry;
            this.Cavalry -= Cavalry;
            this.Ship -= Ship;
            this.Tower -= Tower;
            return true;
        }
        return false;
    }

    public boolean isAvailable(int Infantry, int Cavalry, int Ship, int Tower){
        if (this.Infantry < Infantry) return false;
        if (this.Cavalry < Cavalry) return false;
        if (this.Ship < Ship) return false;
        if (this.Tower < Tower) return false;
        return true;
    }

    public int getInfantry() { return Infantry; }
    public int getCavalry() { return Cavalry; }
    public int getShip() { return Ship; }
    public int getTower() {
        return Tower;
    }
}
