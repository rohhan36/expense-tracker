package controllers;
import exeptions.DrawPileEmptyException;
import exeptions.InvalidPlayerCountException;
import models.*;

import java.util.List;

public class GameController {
    Game game;

    public GameController(){
    }
    public Game startGame(List<Player> players, DrawPile drawPile) throws DrawPileEmptyException {
        return new Game(players, drawPile).build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public void showHand(Game game) {
        game.showHand();
    }

    public GameState checkGameState(Game game) {
        return game.getGameState();
    }

    public void isWinner(Game game) {
        game.isWinner();
    }

    public void askPlayer(Game game) {
        game.askPlayer();
    }

    public void changeStrike(Game game) {
        game.changeStrike();
    }

    public void showTopCard(Game game) {
        game.showTopCard();
    }

    public void validatePlayerCount(int playerCount) throws InvalidPlayerCountException {
        if(playerCount < 2 || playerCount > 4)
            throw new InvalidPlayerCountException();
    }
}
