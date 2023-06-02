package test;

import models.Card;
import models.CardSuit;
import models.CardType;
import models.Value;
import org.junit.Assert;
import org.junit.Test;

public class TestCard {

    @Test
    public void checkIsActionCard() {
        Card card1 = new Card(CardType.ACTION, CardSuit.HEART, Value.JACK); //Action Card
        Card card2 = new Card(CardType.NUMBER, CardSuit.CLUB, Value.NINE); //Number Card

        Assert.assertEquals(card1.isActionCard(), true);
        Assert.assertEquals(card2.isActionCard(), false);
    }
}
