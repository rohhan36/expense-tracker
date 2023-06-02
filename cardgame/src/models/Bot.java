package models;

import strategies.BotPlayingStrategy;

public class Bot extends Player {
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(){}

    public Bot(int playerId, Hand hand, PlayerType playerType, String name) {
        super(playerId, hand, PlayerType.BOT, "ChatGPT");
    }

    @Override
    public int makeMove(Card card) {
        return botPlayingStrategy.makeMove(this.getHand() , card);
    }
}
