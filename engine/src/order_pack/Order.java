package order_pack;

public abstract class Order {
    private boolean isStar;
    private int modifier;
    boolean isAvailable;

    public Order (boolean Star, int modifier){
        isStar = Star;
        isAvailable = true;
        this.modifier = modifier;
    }

    boolean isAvailable(){
        return isAvailable;
    }


    public boolean getNumberOfStar() {
        return isStar;
    }

    public int getModifier() {
        return modifier;
    }


    abstract void execute();
}
