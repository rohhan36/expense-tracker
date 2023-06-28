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
    private Card prevTopCard;

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
        this.prevTopCard = first;
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

        //if it's an action card and this is Not the 1st move of the game
        if(isActionCard() && discardPile.getDiscardPile().size() > 1 && discardPile.checkCard(prevTopCard)) {

            Card topCard = discardPile.getDiscardPile().peek();
            if(topCard.getValue().equals(Value.ACE)) {
                System.out.println(this.direction);
                System.out.println(this.nextPlayerIndex);

                changeStrike();

                System.out.println(this.direction);
                System.out.println(this.nextPlayerIndex);

            } else if (topCard.getValue().equals(Value.KING)) {

                System.out.println(this.direction);
                System.out.println(this.nextPlayerIndex);

                this.toggleDirection();
                changeStrike();

                System.out.println(this.direction);
                System.out.println(this.nextPlayerIndex);

            }  else if (topCard.getValue().equals(Value.QUEEN)) {
                for(int i = 0; i < 2; i++) {
                    players.get(this.nextPlayerIndex).getHand().add(drawPile.drawCard());
                }
                System.out.println("You have drawn 2 card");
                System.out.println();

            } else {
                for(int i = 0; i < 4; i++) {
                    players.get(this.nextPlayerIndex).getHand().add(drawPile.drawCard());
                }
                System.out.println("You have drawn 4 card");
                System.out.println();
            }
        }

        showHand();

        //get input for next card play
        Player player = players.get(this.nextPlayerIndex);
        int cardInd = player.makeMove();

        //draw new card
        if(cardInd == -1) {
            player.getHand().add(drawPile.drawCard());

            //card index should be valid
        } else if(cardInd < player.getHandSize() && cardInd >= 0) {
            Card dropCard = player.getHand().get(cardInd);

            if(!discardPile.checkCard(dropCard)) {
                System.out.println("*********!! Your card didn't match, Please choose a valid card !!*********");
                showTopCard();
                makeMove();
            }

            prevTopCard = discardPile.getDiscardPile().peek();
            discardPile.getDiscardPile().push(dropCard);
            player.getHand().remove(cardInd);

        } else {
            System.out.println("*********!! Please enter a valid card index !!*********");
            System.out.println();

            showTopCard();
            makeMove();
        }
    }

    private void toggleDirection() {
        if(this.direction == Direction.POSITIVE) {
            this.direction = Direction.NEGATIVE;

        } else {
            this.direction = Direction.POSITIVE;
        }
    }

    public void changeStrike() {

        if(this.direction.equals(Direction.POSITIVE)) {
            this.nextPlayerIndex = (this.nextPlayerIndex + 1) % this.players.size();

        } else {
            this.nextPlayerIndex = (this.nextPlayerIndex - 1 + this.players.size()) % players.size();
        }
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

        //because our index was already moved ahead so need to bring it back
        if(this.direction.equals(Direction.POSITIVE)) {
            this.nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
        } else {
            this.nextPlayerIndex = (nextPlayerIndex - 1 + players.size()) % players.size();
        }

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
