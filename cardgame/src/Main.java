import controllers.GameController;
import models.*;
import exeptions.InvalidPlayerCountException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args){

        GameController gameController = new GameController();

        try {
            List<Player> players = new ArrayList<>();
            Deck deck = new Deck();
            DrawPile drawPile = new DrawPile(deck.getCardList());

            Game game = gameController.startGame(players, drawPile);
            System.out.println(players.size() + " Game Started");

            while (gameController.checkGameState(game).equals(GameState.IN_PROGRESS)) {

                //asks next player to have his/her turn
                gameController.askPlayer();
                System.out.println();

                //shows the hand of next player
                gameController.showHand(game);
                System.out.println();

                gameController.makeMove(game);
                gameController.changeStrike(game);



            }
        } catch (Exception e){
            System.out.println("Something went wrong!!");
        }
    }
}
