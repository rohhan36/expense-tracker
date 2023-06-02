import controllers.GameController;
import models.*;
import exeptions.InvalidPlayerCountException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.print("Please enter number of players: ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

        try {
            Deck deck = new Deck();
            DrawPile drawPile = new DrawPile(deck.getCardList());

            List<Player> players = new ArrayList<>();
            int playerCount = sc.nextInt();
            int initialHandSize = 5;

            try {
                gameController.validatePlayerCount(playerCount);

            } catch (Exception e) {
                System.out.println("Please Enter Valid No of Players: ");
                throw new InvalidPlayerCountException();
            }

            for(int i = 0; i < playerCount; i++) {

                System.out.print("Please Enter the name of player no " + (i + 1));
                System.out.println();

                Hand hand = new Hand();
                hand.getInitialHand(initialHandSize, drawPile); //gets initial cards, 5 int this case
                Player player = new Player(i, hand, PlayerType.HUMAN, sc.next());
                players.add(player);
            }

            if(playerCount == 1) {
                Hand hand = new Hand();
                hand.getInitialHand(initialHandSize, drawPile);
                Player bot = new Bot(1, hand);
                players.add(bot);
            }

            for(Player player : players){
                System.out.println(player.toString());
            }

            Game game = gameController.startGame(players, drawPile);

            while (gameController.checkGameState(game).equals(GameState.IN_PROGRESS)) {

                //shows top card on the discard pile
                gameController.showTopCard(game);
                System.out.println();

                gameController.isActionCard(game);

                //asks next player to have his/her turn
                gameController.askPlayer(game);
                System.out.println();

                gameController.makeMove(game);

                //shows the hand of next player
                //gameController.showHand(game);
                System.out.println();

                gameController.isWinner(game);
                gameController.changeStrike(game);
            }

            if(gameController.checkGameState(game).equals(GameState.WIN))
                game.declareWinner();

            else
                game.declareDraw();

        } catch (Exception e){
            System.out.println("Something went wrong!!");
        }
    }
}
