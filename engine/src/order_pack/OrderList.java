package order_pack;

import exception_pack.InvalidOrderExeption;
import main_pack.Player;
import main_pack.PlayerName;
import map_pack.Area;

import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orderList;
    private int numberOfStar;

    public OrderList(){
        orderList = new ArrayList<Order>();
        orderList.add(new Attack(false, -1));
        orderList.add(new Attack(false, 0));
        orderList.add(new Attack(true, 1));
        orderList.add(new Defence(false, 1));
        orderList.add(new Defence(false, 1));
        orderList.add(new Defence(true, 2));
        orderList.add(new Fire(false, 0));
        orderList.add(new Fire(false, 0));
        orderList.add(new Fire(true, 0));
        orderList.add(new GetTaxes(false, 0));
        orderList.add(new GetTaxes(false, 0));
        orderList.add(new GetTaxes(true, 0));
        orderList.add(new Support(false, 0));
        orderList.add(new Support(false, 0));
        orderList.add(new Support(true, 0));
    }

    public void giveOrder(Order order,Locationlocation, Player player) throws InvalidOrderExeption {
        if (!order.isAvailable()) throw new InvalidOrderExeption();
        if (area.getOwner() != player) throw new InvalidOrderExeption();
        if (order.hasStar() && (numberOfStar==0)) throw new InvalidOrderExeption();
        if (area.getOrder() != null) throw new InvalidOrderExeption();
        order.setAvailable(false);
        if(order.hasStar()) numberOfStar--;
       location.setOrder(order);
    }

    public void backOrder(Arealocation, Player player) throws InvalidOrderExeption {
        if (area.getOwner() != player) throw new InvalidOrderExeption();
        if (area.getOrder() != null) throw new InvalidOrderExeption();
        if(area.getOrder().hasStar()) numberOfStar++;
       location.getOrder().setAvailable(true);
       location.setOrder(null);
    }

    public void setNumberOfStar(int numberOfStar) {
        this.numberOfStar = numberOfStar;
    }

    public int getNumberOfStar() {
        return numberOfStar;
    }
}
