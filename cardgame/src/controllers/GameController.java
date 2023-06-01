package controllers;
import exeptions.InvalidPlayerCountException;
import models.DrawPile;
import models.Game;
import models.Player;
import java.util.List;

public class GameController {
    Game game;
    public static Game startGame(List<Player> players, DrawPile drawPile) throws InvalidPlayerCountException {
        return new Game(players, drawPile).build();
    }

    void makeMove(Game game) {

    }

    void showHand(Game game) {

    }

    void checkGameState(Game game) {

    }

    void getWinner(Game game) {

    }
}
