package military_pack;

import exception_pack.NotEnoughSoldier;
import main_pack.Player;
import map_pack.Location;

public class MoveCorp {
    public static void orderOfMarch(Location start, Location Stop){

    }

    public static void retreatDefender(Location start, Player player){

    }

    public static void retreatAtacker(Location location){
        try {
            location.getSelectedCorp().substractSoldier(0, 0, 0, location.getSelectedCorp().getTower());
        } catch (NotEnoughSoldier e) {

        }
        move(location.getSelectedCorp(), location.getBrokenCorp());
    }

    private static void atack(){

    }

    private static void move(Corp source, Corp destination){
        destination.addSoldier(source.getInfantry(), source.getCavalry(), source.getShip(), source.getTower());
        source = new Corp(0, 0, 0, 0);
    }
}
