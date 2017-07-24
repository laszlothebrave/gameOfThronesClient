package order_pack;

public class OrderList {
    Order orderTab[];

    public OrderList(){
        orderTab[0] = new Attack(false, -1);
        orderTab[1] = new Attack(false, 0);
        orderTab[2] = new Attack(true, 1);
        orderTab[3] = new Defence(false, 1);
        orderTab[4] = new Defence(false, 1);
        orderTab[5] = new Defence(true, 2);
        orderTab[6] = new Fire(false, 0);
        orderTab[7] = new Fire(false, 0);
        orderTab[8] = new Fire(true, 0);
        orderTab[9] = new GetTaxes(false, 0);
        orderTab[10] = new GetTaxes(false, 0);
        orderTab[11] = new GetTaxes(true, 0);
        orderTab[12] = new Support(false, 0);
        orderTab[13] = new Support(false, 0);
        orderTab[14] = new Support(true, 0);
    }

    void giveOrder(){

    }
}
