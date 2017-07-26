package data_pack.card_pack;

public abstract class CardStack {
    private Card cards[];
    private int current = 0;

    public CardStack(int number){
        cards = new Card[number];
    }

    public void shuffle(){}
    public Card reveal(){ return cards[current]; }
    public void refresh(){}
}
