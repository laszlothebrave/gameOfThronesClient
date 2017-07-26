package military_pack;

import exception_pack.UnitTypeLimitReachedException;
import main_pack.Player;
import map_pack.Area;

public class MoveArmy {
    public static void marchOrder(Area start, Area Stop){

    }

    public static void retreatDefender(Area start, Player player){

    }

    public static void retreatAttacker(Area area){
        try {
            area.getSelectedArmy().removeSoldier(0, 0, 0, area.getSelectedArmy().getTower());
        } catch (UnitTypeLimitReachedException e) {

        }
        move(area.getSelectedArmy(), area.getRoutedArmy());
    }

    private static void attack(){

    }

    private static void move(Army source, Army destination){
        destination.addSoldier(source.getInfantry(), source.getCavalry(), source.getShip(), source.getTower());
        source = new Army(0, 0, 0, 0);
    }
}
