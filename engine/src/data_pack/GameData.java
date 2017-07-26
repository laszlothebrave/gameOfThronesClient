package data_pack;

import data_pack.card_pack.westeros_card_pack.*;
import data_pack.card_pack.wildling_card_pack.*;
import data_pack.map_pack.*;
import data_pack.track_pack.*;
import data_pack.card_pack.*;

public class GameData {

    private Map map;
    private PlayerList playerList;

    private int roundCounter;
    private int wildlingsCounter;

    private ThroneTrack throneTrack;
    private SwordTrack swordTrack;
    private RavenTrack ravenTrack;

    private FirstWesterosCardStack firstWesterosCardStack;
    private SecondWesterosCardStack secondWesterosCardStack;
    private ThirdWesterosCardStack thirdWesterosCardStack;
    private WildlingCardStack wildlingCardStack;

    GameData(int playersNumber){
        map = new Map(playersNumber);
        playerList = new PlayerList(playersNumber);

        roundCounter = 1;
        wildlingsCounter = 0;

        throneTrack = new ThroneTrack(playersNumber);
        swordTrack = new SwordTrack(playersNumber);
        ravenTrack = new RavenTrack(playersNumber);

        firstWesterosCardStack = new FirstWesterosCardStack();
        secondWesterosCardStack = new SecondWesterosCardStack();
        thirdWesterosCardStack = new ThirdWesterosCardStack();
        wildlingCardStack = new WildlingCardStack();
    }

    public void nextRound(){
        roundCounter += 1;
    }

    public Card revealFirstCard(){ return firstWesterosCardStack.reveal(); }
    public Card revealSecondCard(){ return secondWesterosCardStack.reveal(); }
    public Card revealThirdCard(){ return thirdWesterosCardStack.reveal(); }
}
