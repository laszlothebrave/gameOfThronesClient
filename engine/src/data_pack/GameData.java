package data_pack;

public class GameData {

    public int roundCounter;
    public int wildlingsCounter;
    public Track throneTrack[];
    public Track swordTrack[];
    public Track ravenTrack[];
    public Map map;

    GameData(int playersNumber){
        roundCounter = 1;
        wildlingsCounter = 0;
        initialize(playersNumber);
    }

    private void initialize(int playersNumber){
    switch(playersNumber) {
        case 3: initializeFor3(); break;
        case 4: initializeFor4(); break;
        case 5: initializeFor5(); break;
        case 6: initializeFor6(); break;
    }
}

    private void initializeFor3() {
    }

    private void initializeFor4() {
    }

    private void initializeFor5() {
    }

    private void initializeFor6() {
    }

    void nextRound(){
        roundCounter += 1;
    }

}
