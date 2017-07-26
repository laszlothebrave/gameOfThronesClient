package map_pack;

import military_pack.Army;
import order_pack.Order;
import main_pack.Player;

public abstract class Area {
    AreaName areaName;
    Player owner;
    Army army;
    Army selectedArmy;

    public Army getSelectedArmy() {
        return selectedArmy;
    }

    public Army getRoutedArmy() {
        return routedArmy;
    }

    Army routedArmy;
    Order order;

    Area(AreaName areaName){
        this.areaName = areaName;
        owner = null;
        army = new Army(0, 0, 0, 0);
        selectedArmy = new Army(0, 0, 0, 0);
        routedArmy = new Army(0, 0, 0, 0);
        order = null;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return areaName.getName();
    }

    public Player getOwner() {
        return owner;
    }

    public Army getArmy() {
        return army;
    }

    public Order getOrder() {
        return order;
    }

    public abstract int getSupplies();
    public abstract boolean hasVictoryPoint();
}
