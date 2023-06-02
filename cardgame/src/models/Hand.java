package models;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

     public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void getInitialHand(int initialHandSize, DrawPile drawPile) {
        for(int i = 0; i < initialHandSize; i++) {
            this.hand.add(drawPile.drawCard());
        }
    }

    public int size() {
        return this.hand.size();
    }
}
