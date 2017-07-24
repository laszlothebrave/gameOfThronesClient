package main_pack;

import map_pack.Location;
import map_pack.LocationList;
import military_pack.Corp;
import house_pack.House;
import order_pack.OrderList;
import wallet_pack.Wallet;

public class Player {
    private PlayerName playerName;
    private Wallet wallet;
    private Corp corp;
    private OrderList orderList;
    private House house;

    Player(House house, PlayerName playerName){
        this.playerName = playerName;
        wallet = new Wallet();
        corp = new Corp(10, 5, 6, 2);
        orderList = new OrderList();
        this.house = house;
    }

    public String getPlayerName() {
        return playerName.getName();
    }

    public Wallet getWallet() {
        return wallet;
    }

    public Corp getCorp() {
        return corp;
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
