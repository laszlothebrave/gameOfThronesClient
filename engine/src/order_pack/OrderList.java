package order_pack;

import exception_pack.WrongOrder;
import map_pack.Location;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private ArrayList<Order> orderList;

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

    void giveOrder(Order order, Location location) throws WrongOrder {
        if (order.isAvailable()) throw new WrongOrder();
    }

    void backOrder(Location location) throws WrongOrder {

    }
}
