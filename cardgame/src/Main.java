import controllers.GameController;
import models.*;


public class Main {
    public static void main(String args[]) {
        Deck deck = new Deck();
        DrawPile drawPile = new DrawPile(deck.getCardList());

        int card = 0;
        while(true){
            Card currCard = drawPile.drawCard();
            System.out.println(currCard.toString(currCard));
            card++;
        }
    }
}
