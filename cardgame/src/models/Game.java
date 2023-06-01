package models;

import exeptions.InvalidPlayerCountException;

import java.util.List;

public class Game {
    private List<Player> players;
    private Deck deck;
    private GameState gameState;
    private Direction direction;
    private DrawPile drawPile;
    private DiscardPile discardPile;
    private int nextPlayerIndex;
    private Player winner;

    public Game(){}

    public Game(List<Player> players, DrawPile drawPile){
        this.gameState = GameState.IN_PROGRESS;
        this.direction = Direction.POSITIVE;
        this.players = players;
        this.drawPile = drawPile;
        this.discardPile = new DiscardPile();
        this.nextPlayerIndex = 0;
    }

    public void validatePlayerCount() throws InvalidPlayerCountException{
        if(players.size() < 1 || players.size() > 4)
            throw new InvalidPlayerCountException();
    }

    public Game build() throws InvalidPlayerCountException {
        validatePlayerCount();
        return new Game(players, drawPile);
    }
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public DrawPile getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(DrawPile drawPile) {
        this.drawPile = drawPile;
    }

    public DiscardPile getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(DiscardPile discardPile) {
        this.discardPile = discardPile;
    }

    public int getNextPlayer() {
        return nextPlayerIndex;
    }

    public void setNextPlayer(int nextPlayer) {
        this.nextPlayerIndex = nextPlayer;
    }
}
