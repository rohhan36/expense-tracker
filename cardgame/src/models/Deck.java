package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList;
    private int deckSize;

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Deck() {
        cardList = new ArrayList<>();
        CardSuit[] cardSuits = CardSuit.values();
        Value[] cardValues = Value.values();

        for(int i = 0; i < cardSuits.length; i++) {
            for(int j = 0; j < cardValues.length; j++) {
                Card card = new Card(j < 10 ? CardType.NUMBER : CardType.ACTION, cardSuits[i], cardValues[j]);
                cardList.add(card);
            }
        }
        deckSize =  cardList.size();
        Collections.shuffle(cardList);
    }
}
