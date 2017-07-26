package military_pack;

import card_pack.Card;

public abstract class Leader implements Card {
    private int Strength;
    public void resolve(){}
    Leader(int Strength){
        this.Strength = Strength;
    }
}
