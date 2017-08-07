package data_pack.track_pack;

import data_pack.Player;

public abstract class Track{
    private Player track[];

    public Track(int playersNumber){
        track = new Player[playersNumber];
    }

    public Player getFirst(){ return track[0]; }


}