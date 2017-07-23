package main_pack;

import map_pack.Map;

/**
 * Główna klasa do obsługi gry
 * roundCounter - licznik rund
 * wildlingsCounter - licznik Dzikich
 * ravenOwner - referencja na gracza posiadającego Kruka
 * throneOwner - referencja na gracza posiadającego Żelazny Tron
 * map - mapa
 * players - tablica graczy (chyba będzie posortowana malejąca względem kolejności na żelaznym tronie)
 */
public class Game {
    public int roundCounter;
    public int wildlingsCounter;
    public Player ravenOwner;
    public Player throneOwner;
    public Map map;
    public Player players[];

    Game(int playersNumber){

    }

    void nextRouund(){

    }
}
