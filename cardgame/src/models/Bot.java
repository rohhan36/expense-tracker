package models;

public class Bot extends Player {
     public Bot(){}

    public Bot(int playerId, Hand hand) {
        super(playerId, hand, PlayerType.BOT, "chatGPT");
    }

    public int makeMove(Card card) {
        for(int i = 0; i < getHand().size(); i++) {
            Card currCard = getHand().get(i);
            if(currCard.getCardSuit().equals(card.getCardSuit()) || currCard.getValue().equals(card.getValue()))
                return i + 1;
        }
        return 0;
    }
}
