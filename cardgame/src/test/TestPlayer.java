package test;

import models.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Suite;

public class TestPlayer {

    @Test
    public void checkDrawCard() {
        Deck deck = new Deck();
        DrawPile drawPile = new DrawPile(deck.getCardList());
        Hand hand = new Hand();

        Player player = new Player(0, hand, PlayerType.HUMAN, "TEST");

        //No of cards in hand before the draw
        int handSizeBeforeDraw = player.getHandSize(); //0
        player.drawCads(5, drawPile);

        //No of cards in hand after the draw
        int handSizeAfterDraw = player.getHandSize(); //5

        Assert.assertNotEquals(handSizeBeforeDraw, handSizeAfterDraw);
    }
}
