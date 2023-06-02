package test;

import models.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGame {
    Deck deck = new Deck();
    List<Player> players;
    @Test
    public void checkToggleDirection() {
        Game game = new Game(); //game initialises with POSITIVE direction
        Direction direction = game.getDirection();

        game.toggleDirection(); //After toggle direction should change

        Assert.assertNotEquals(direction, game.getDirection());
    }

    @Test
    public void checkChangeStrike() {

        //dummy players
        Player p1 = new Player();
        Player p2 = new Player();

        players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        //game starts with nextPlayerIndex = 0;
        Game game = new Game(players, new DrawPile(deck.getCardList()));
        int currPlayer = game.getNextPlayer();

        game.changeStrike();

        //after we change strike nextPlayerIndex should be 1
        Assert.assertEquals(game.getNextPlayer(), 1);

        game.toggleDirection();
        game.changeStrike();

        //after changing direction if we change strike nextPlayerIndex should become 0
        Assert.assertEquals(game.getNextPlayer(), 0);
    }

    @Test
    public void checkIsActionCard() {

        DrawPile drawPile = new DrawPile(deck.getCardList());
        Hand hand = new Hand();
        Player p1 = new Player(0, hand, PlayerType.HUMAN, "TEST");
        Player p2 = new Player(0, hand, PlayerType.HUMAN, "TEST");
        players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        Game game = new Game(players, drawPile);
        Card ace = new Card(CardType.ACTION, CardSuit.SPADE, Value.ACE);
        Card king = new Card(CardType.ACTION, CardSuit.SPADE, Value.KING);
        Card queen = new Card(CardType.ACTION, CardSuit.SPADE, Value.QUEEN);
        Card jack = new Card(CardType.ACTION, CardSuit.SPADE, Value.JACK);

        //if there is ace as the top card
        game.getDiscardPile().push(ace);
        game.isActionCard();

        //nextPlayerIndex of game should increase from 0 to 1 to skip the strike of curr player
        Assert.assertEquals(game.getNextPlayer(), 1);

        //if there is king as the top card
        game.getDiscardPile().push(king);
        game.isActionCard();

        //game direction should change from POSITIVE to NEGATIVE
        Assert.assertEquals(game.getDirection(), Direction.NEGATIVE);

        //if there is queen as the top card
        game.getDiscardPile().push(queen);
        game.isActionCard();

        //currPlayer's hand size should increase by 2
        Assert.assertEquals(game.getPlayers().get(game.getNextPlayer()).getHandSize(), 2);

        //if there is jack as the top card
        game.getDiscardPile().push(jack);
        game.isActionCard();

        //currPlayer's hand size should increase by 4
        Assert.assertEquals(game.getPlayers().get(game.getNextPlayer()).getHandSize(), 6);
    }
}
