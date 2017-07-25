package military_pack;

import exception_pack.NotEnoughSoldierExeption;
import main_pack.Player;
import map_pack.Location;

public class MoveCorp {
    public static void orderOfMarch(Location start, Location Stop){

    }

    public static void retreatDefender(Location start, Player player){

    }

    public static void retreatAtacker(Location location){
        try {
            location.getSelectedArmy().substractSoldier(0, 0, 0, location.getSelectedArmy().getTower());
        } catch (NotEnoughSoldierExeption e) {

        }
        move(location.getSelectedArmy(), location.getRoutedArmy());
    }

    private static void atack(){

    }

    private static void move(Army source, Army destination){
        destination.addSoldier(source.getInfantry(), source.getCavalry(), source.getShip(), source.getTower());
        source = new Army(0, 0, 0, 0);
    }
}
