package main_pack;

import data_pack.GameData;

import java.util.concurrent.LinkedBlockingQueue;

public class Game implements Runnable{
    public LinkedBlockingQueue queue;
    private GameData gameData;

    public Game(int playersNumber, LinkedBlockingQueue queue){
        this.queue = queue;
        gameData = new GameData(playersNumber);
    }

    @Override
    public void run() {
        while(true) {
            checkmessage();
        }
    }

    private void checkmessage() {
        try {
            queue.put(queue.take() + " checked");
        } catch (InterruptedException e){

        }
    }
}
