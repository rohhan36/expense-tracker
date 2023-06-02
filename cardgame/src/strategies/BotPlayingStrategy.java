package strategies;
import models.Card;

import java.util.List;

public class BotPlayingStrategy{
    public int makeMove(List<Card> hand, Card topCard){
        for(int i = 0; i < hand.size(); i++){
            Card card = hand.get(i);
            if(card.getCardSuit().equals(topCard.getCardSuit()) || card.getValue().equals(topCard.getValue())) {
                return i + 1;
            }
        }
        return 0;
    }
}
