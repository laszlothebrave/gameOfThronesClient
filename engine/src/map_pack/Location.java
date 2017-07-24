package map_pack;

import military_pack.Corp;
import order_pack.Order;
import main_pack.Player;

public abstract class Location {
    String name;
    Player owner;
    Corp corp;
    Order order;
    Location(String name){
        this.name = name;
        owner = null;
        corp = new Corp(0, 0, 0, 0);
        order = null;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setCorp(Corp corp) {
        this.corp = corp;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Player getOwner() {
        return owner;
    }

    public Corp getCorp() {
        return corp;
    }

    public Order getOrder() {
        return order;
    }

    public abstract int getSupplies();
    public abstract int getVictory();
    public abstract int addLocation(Location location);
    public abstract int substractLocation(Location location);
}
