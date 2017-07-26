package data_pack;

import data_pack.map_pack.*;
import data_pack.track_pack.*;

public class GameData {

    private int roundCounter;
    private int wildlingsCounter;
    private ThroneTrack throneTrack;
    private SwordTrack swordTrack;
    private RavenTrack ravenTrack;
    private Map map;

    GameData(int playersNumber){
        roundCounter = 1;
        wildlingsCounter = 0;
        throneTrack = new ThroneTrack(playersNumber);
        swordTrack = new SwordTrack(playersNumber);
        ravenTrack = new RavenTrack(playersNumber);
        map = new Map(playersNumber);
    }

    void nextRound(){
        roundCounter += 1;
    }

}
