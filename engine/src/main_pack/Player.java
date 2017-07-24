package main_pack;

import military_pack.Corp;
import house_pack.House;
import order_pack.OrderList;
import wallet_pack.Wallet;

public class Player {
    String playerName;
    Wallet wallet;
    Corp corp;
    OrderList orderList;
    House house;

    Player(House house, String playerName){
        this.playerName = playerName;
        wallet = new Wallet();
        corp = new Corp(10, 5, 6, 2);
        orderList = new OrderList();
        this.house = house;
    }
}
