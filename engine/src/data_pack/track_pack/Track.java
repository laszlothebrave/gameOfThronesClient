package data_pack.track_pack;

public abstract class Track{
    private Player track[];

    public Track(int playersNumber){
        track = new Player[playersNumber];
    }

    public void bid(){

    }

    public Track getTrack(){ return track }
}