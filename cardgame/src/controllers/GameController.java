package controllers;
import exeptions.InvalidPlayerCountException;
import models.*;

import java.util.List;

public class GameController {
    Game game;

    public GameController(){}
    public Game startGame(List<Player> players, DrawPile drawPile) throws InvalidPlayerCountException {
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

    void getWinner(Game game) {

    }

    public void askPlayer() {
        game.askPlayer();
    }

    public void changeStrike(Game game) {
        game.changeStrike();
    }
}
