package corps_pack;

/**
 * Typ wyliczeniowy dla jednostek
 */
public enum Soldier {
    INFANTRY(1), CHIVALRY(2), SHIP(1), TOWER(0);

    public int strength;
    Soldier(int i){ strength = i; }
}
