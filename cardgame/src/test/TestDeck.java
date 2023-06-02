package test;
import models.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDeck {

    //Checks if deck is shuffled or not
    @Test
    public void checkDeck() {
        List<Card> unShuffledDeck = new ArrayList<>(); //making new Un-shuffled deck

        CardSuit[] cardSuits = CardSuit.values();
        Value[] cardValues = Value.values();

        for (CardSuit suit : CardSuit.values()) {
            for (int j = 0; j < cardValues.length; j++) {
                Card card = new Card(j < 9 ? CardType.NUMBER : CardType.ACTION, suit, cardValues[j]);
                unShuffledDeck.add(card);
            }
        }

        Deck deck = new Deck();
        List<Card> shuffledDeck = deck.getCardList(); //Shuffled deck

        //checking if both deck are same or not
        Assert.assertNotEquals(unShuffledDeck.toString(), shuffledDeck.toString());
    }
}