package models;

import java.util.ArrayList;
import java.util.List;

public class DiscardPile {
    private List<Card> discardPile;

    public DiscardPile(){
        discardPile = new ArrayList<>();
    }

    public void add(Card card) {
        this.discardPile.add(card);
    }

    public List<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(List<Card> discardPile) {
        this.discardPile = discardPile;
    }
}
