package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cardList;
    private int cardsInDeck;

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Deck() {
        cardList = new ArrayList<>();


    }


}
