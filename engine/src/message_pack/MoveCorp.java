package message_pack;

import main_pack.PlayerName;
import map_pack.Location;
import military_pack.Corp;

import java.io.Serializable;

public class MoveCorp extends Message implements Serializable {
    Location start;
    Location stop;
    Corp corp;

    MoveCorp(PlayerName player, Location start, Location stop) {
        super(player);
        this.start = start;
        this.stop = stop;
    }
}
