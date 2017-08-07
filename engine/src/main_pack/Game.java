package main_pack;

import data_pack.GameData;

import java.util.concurrent.LinkedBlockingQueue;

public class Game implements Runnable{
    private GameData gameData;

    public Game(int playersNumber, LinkedBlockingQueue queue){
        gameData = new GameData(playersNumber);
    }

    @Override
    public void run() {
        while(true) {

        }
    }
}
