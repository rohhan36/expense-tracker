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
        this.cardList = new ArrayList<>();
        CardSuit[] cardSuits = CardSuit.values();
        Value[] cardValues = Value.values();

        for(CardSuit suit : CardSuit.values()) {
            for(int j = 0; j < cardValues.length; j++) {
                Card card = new Card(j < 9 ? CardType.NUMBER : CardType.ACTION, suit, cardValues[j]);
                cardList.add(card);
            }
        }
        deckSize =  cardList.size();
        Collections.shuffle(cardList);
    }
    public int getSize(){
        return deckSize;
    }
}
