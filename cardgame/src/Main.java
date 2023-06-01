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

            GameController.startGame(players, drawPile);
            System.out.println(players.size() + " Game Started");

        } catch (Exception e){
            System.out.println("Something went wrong!!");
        }
    }
}
