package main_pack;

import data_pack.GameData;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Engine implements Runnable{
    private GameData gameData;
    private NetworkExample networkExample;

    public Engine(NetworkExample networkExample){
        gameData = new GameData(playersList);
    }

    @Override
    public void run() {
        while(true) {

        }
    }
}
