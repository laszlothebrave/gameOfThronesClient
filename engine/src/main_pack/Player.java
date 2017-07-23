package main_pack;

import corps_pack.Corps;
import map_pack.Location;
import order_pack.Orders;

/**
    Klasa realizująca działania gracza
 */
public class Player {
    Location locations;
    Orders orders;
    Corps corps;
    int suppliesPath;
    int victoryPath;
    int influenceThrone;
    int influenceSword;
    int influenceRaven;
    int maxGold;
    int currentGold;
    Player(){

    }
}
