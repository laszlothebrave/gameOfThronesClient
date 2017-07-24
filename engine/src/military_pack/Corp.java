package military_pack;

import exception_pack.NotEnoughSoldier;

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

    public void substractSoldier (int Infantry, int Cavalry, int Ship, int Tower) throws NotEnoughSoldier{
        isAvailable(Infantry, Cavalry, Ship, Tower);
        this.Infantry -= Infantry;
        this.Cavalry -= Cavalry;
        this.Ship -= Ship;
        this.Tower -= Tower;
    }

    public void isAvailable(int Infantry, int Cavalry, int Ship, int Tower) throws NotEnoughSoldier{
        if (this.Infantry < Infantry) throw new NotEnoughSoldier();
        if (this.Cavalry < Cavalry) throw new NotEnoughSoldier();
        if (this.Ship < Ship) throw new NotEnoughSoldier();
        if (this.Tower < Tower) throw new NotEnoughSoldier();
    }

    public int getInfantry() { return Infantry; }
    public int getCavalry() { return Cavalry; }
    public int getShip() { return Ship; }
    public int getTower() {
        return Tower;
    }
}
