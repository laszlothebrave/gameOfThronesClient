package military_pack;

import exception_pack.NotEnoughSoldierExeption;

public class Army {
    private int Infantry;
    private int Cavalry;
    private int Ship;
    private int Tower;

    public Army(int Infantry, int Cavalry, int Ship, int Tower){
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

    public void substractSoldier (int Infantry, int Cavalry, int Ship, int Tower) throws NotEnoughSoldierExeption {
        isAvailable(Infantry, Cavalry, Ship, Tower);
        this.Infantry -= Infantry;
        this.Cavalry -= Cavalry;
        this.Ship -= Ship;
        this.Tower -= Tower;
    }

    public void isAvailable(int Infantry, int Cavalry, int Ship, int Tower) throws NotEnoughSoldierExeption {
        if (this.Infantry < Infantry) throw new NotEnoughSoldierExeption();
        if (this.Cavalry < Cavalry) throw new NotEnoughSoldierExeption();
        if (this.Ship < Ship) throw new NotEnoughSoldierExeption();
        if (this.Tower < Tower) throw new NotEnoughSoldierExeption();
    }

    public int getInfantry() { return Infantry; }
    public int getCavalry() { return Cavalry; }
    public int getShip() { return Ship; }
    public int getTower() {
        return Tower;
    }
}
