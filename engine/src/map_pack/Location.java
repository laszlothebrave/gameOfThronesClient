package map_pack;

import corps_pack.Corps;
import order_pack.Orders;
import main_pack.Player;

/**
 * Klasa lokacji na mapie
 * name - nazwa lokacji
 * corps - korpus lokacji
 * order - rozkaz położony na lokacji
 * supplies, influence, castleStrength, isLand, isPort, hasMark, owner - cechy lokacji
 */
public class Location {
    String name;
    Corps corps;
    Orders order;
    int supplies;
    int castleStrength;
    int influence;
    Player owner;
    boolean isLand;
    boolean isPort;
    boolean hasMark;
    Location(String name, boolean isLand, boolean isPort, int supplice, int castleStrength, int influence){

    }
}
