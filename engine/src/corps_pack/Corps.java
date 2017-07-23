package corps_pack;

/**
 * Klasa korpusu
 * soldier jest tablicą żołnierzy w korpusie
 * Number jest liczbą jednostek w korpusie
 */
public class Corps {
    private Soldier soldiers[];
    public int Number;

    public Soldier[] getSoldier(){ return soldiers; }
    public void addToCorps(Soldier soldiers[]){}
    public Soldier[] removeFromCorps(Soldier soldiers[]){ return this.soldiers; }
    public void moveTroops(){}
}
