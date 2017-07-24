package main_pack;

import map_pack.Map;

public class Game {
    public int roundCounter;
    public int wildlingsCounter;
    public Player thronePath[];
    public Player swordPath[];
    public Player ravenPath[];
    public Map map;

    Game(int playersNumber){
        switch(playersNumber) {
            case 3: initializeFor3();
            case 4: initializeFor4();
            case 5: initializeFor5();
            case 6: initializeFor6();
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

    void nextRouund(){
    }

}
