package data_pack;

import data_pack.map_pack.*;
import data_pack.track_pack.*;

public class GameData {

    public int roundCounter;
    public int wildlingsCounter;
    public ThroneTrack throneTrack;
    public SwordTrack swordTrack;
    public RavenTrack ravenTrack;
    public Map map;

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
