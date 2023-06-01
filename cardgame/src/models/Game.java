package models;

import exeptions.DrawPileEmptyException;
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

    public Game(List<Player> players, DrawPile drawPile) throws DrawPileEmptyException {
        this.gameState = GameState.IN_PROGRESS;
        this.direction = Direction.POSITIVE;
        this.players = players;
        this.drawPile = drawPile;
        this.discardPile = new DiscardPile();
        this.nextPlayerIndex = 0;

        Card first = drawPile.drawCard();
        discardPile.push(first);
    }

    public void validatePlayerCount(int playerCount) throws InvalidPlayerCountException{
        if(playerCount < 2 || playerCount > 4)
            throw new InvalidPlayerCountException();
    }

    public Game build() throws DrawPileEmptyException {
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
        System.out.println();
        System.out.println("--------------------> " + players.get(getNextPlayer()).getName() + "'s turn <--------------------");
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
                    try {
                        players.get(nextPlayerIndex).getHand().add(drawPile.drawCard());
                    } catch (Exception e){
                        this.gameState = GameState.DRAW;
                    }
                }
                System.out.println("You have drawn 2 card");

            } else {
                for(int i = 0; i < 4; i++) {
                    try {
                        players.get(nextPlayerIndex).getHand().add(drawPile.drawCard());
                    } catch (Exception e) {
                        this.gameState = GameState.DRAW;
                    }
                }
                System.out.println("You have drawn 4 card");
            }
        }

        Player player = players.get(nextPlayerIndex);
        int cardInd = player.makeMove();

        if(cardInd == 0) {
            try {
                player.getHand().add(drawPile.drawCard());
            } catch (Exception e){
                this.gameState = GameState.DRAW;
            }

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

    public void isWinner() {
        if(players.get(nextPlayerIndex).isWinner()){
            this.gameState = GameState.WIN;
        }
    }

    public void declareWinner(){
        System.out.println("GAME OVER");
        System.out.println(players.get(nextPlayerIndex).getName() + " is the winner");
        System.exit(0);
    }

    public void declareDraw() {
        System.out.println("GAME OVER");
        System.out.println("No one is winner");
        System.out.println();
        System.exit(0);
    }

    public void showTopCard() {
        discardPile.showTopCard();
    }

    public String toString(){
        return this.gameState + " " + this.direction + " " + this.nextPlayerIndex + " " + this.drawPile.getDrawPile().peek().toString();
    }
}
