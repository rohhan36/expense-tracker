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

    public void showHand() {
        players.get(nextPlayerIndex).showHand();
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

    public void askPlayer() {
        System.out.println(players.get(getNextPlayer()).getName() + "'s turn");
    }

    public void makeMove() {

        if(isActionCard()) {
            Card topCard = discardPile.getDiscardPile().peek();
            if(topCard.getValue().equals(Value.ACE)) {
                changeStrike();

            } else if (topCard.getValue().equals(Value.KING)) {
                this.direction = this.direction.toggle(direction);
                changeStrike();

            }  else if (topCard.getValue().equals(Value.QUEEN)) {
                for(int i = 0; i < 2; i++) {
                    players.get(nextPlayerIndex).getHand().add(drawPile.drawCard());
                }
                System.out.println("You have drawn 2 card");

            } else {
                for(int i = 0; i < 4; i++) {
                    players.get(nextPlayerIndex).getHand().add(drawPile.drawCard());
                }
                System.out.println("You have drawn 4 card");
            }
        }

        Player player = players.get(nextPlayerIndex);
        int cardInd = player.makeMove();

        if(cardInd == 0) {
            player.getHand().add(drawPile.drawCard());

        } else {
            Card dropCard = player.getHand().get(cardInd - 1);

            if(!discardPile.checkCard(dropCard)){
                System.out.println("Your card didn't match, Please choose a valid card");
                makeMove();
            }

            discardPile.getDiscardPile().push(dropCard);
            player.getHand().remove(cardInd - 1);
        }
    }

    public void changeStrike() {
        if(direction.equals(Direction.POSITIVE))
            nextPlayerIndex = (nextPlayerIndex + 1) % players.size();

        else
            nextPlayerIndex = (nextPlayerIndex - 1 + players.size()) % players.size();
    }

    public boolean isActionCard() {
        Card currCard = this.discardPile.getDiscardPile().peek();
        return currCard.getCardType().equals(CardType.ACTION);
    }
}
