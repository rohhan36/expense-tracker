package models;

public class Player {
    private int playerId;
    private Hand hand;
    private PlayerType playerType;

    public Player(){}

    public Player(int playerId, Hand hand, PlayerType playerType) {
        this.playerId = playerId;
        this.hand = hand;
        this.playerType = playerType;
    }
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
