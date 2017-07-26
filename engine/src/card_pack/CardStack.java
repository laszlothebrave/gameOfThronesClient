package card_pack;

/**
 * Klasa stosu kart Westeros i kart Dzikich
 * Stos jest inicjalizowany na sztywno odpowiednimi kartami
 * Funkcja shuffle tasuje stos
 * Funkcja refresh tasuje stos i ustawia current na 0
 * Funkcja pop przestawia current o 1
 */
public class CardStack {
    private Card cards[];
    private int current = 0;

    public CardStack(){

    }

    public void shuffle(){}
    public Card reveal(){ return cards[current]; }
    public void refresh(){}
}
