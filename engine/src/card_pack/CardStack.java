package card_pack;

public class CardStack {
    private Card cards[];
    private int current = 0;

    public CardStack(){

    }

    public void shuffle(){}
    public Card pop(){ return cards[current]; }
    public void refresh(){}
}
