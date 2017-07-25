package main_pack;

import map_pack.Location;
import military_pack.Army;
import house_pack.House;
import order_pack.OrderList;
import wallet_pack.Wallet;

public class Player {
    private PlayerName playerName;
    private Wallet wallet;
    private Army army;
    private OrderList orderList;
    private House house;

    Player(PlayerName playerName){
        this.playerName = playerName;
        wallet = new Wallet();
        army = new Army(10, 5, 6, 2);
        orderList = new OrderList();
        this.house = null;
    }

    public String getPlayerName() {
        return playerName.getName();
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Army getArmy() {
        return army;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public House getHouse() {
        return house;
    }

    public void addLocation(Location location){
        house.getLocationList().addLocation(location, this);

    }
}
