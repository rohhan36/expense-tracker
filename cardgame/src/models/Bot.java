package models;

public class Bot extends Player {
    public Bot(){}

    public Bot(int playerId, Hand hand, PlayerType playerType, String name) {
        super(playerId, hand, PlayerType.BOT, "ChatGPT");
    }

    @Override
    public int makeMove() {
        return super.makeMove();
    }
}
