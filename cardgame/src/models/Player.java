package models;

import java.util.List;
import java.util.Scanner;

public class Player {
    private int playerId;
    private Hand hand;
    private String name;
    private PlayerType playerType;
    private Scanner sc;

    public Player(){}

    public Player(int playerId, Hand hand, PlayerType playerType, String name) {
        this.playerId = playerId;
        this.hand = hand;
        this.playerType = playerType;
        this.name = name;
        this.sc = new Scanner(System.in);
    }
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public List<Card> getHand() {
        return hand.getHand();
    }

    public int getHandSize() {
        return hand.getHand().size();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int makeMove(Card card) {
        System.out.println("Choose the index of the card you want to play: ");
        System.out.println("If you don't have a matching card, Please enter 0 to draw a card");
        int cardInd = sc.nextInt();
        return cardInd;
    }

    public void showHand() {
        for(int i = 0; i < this.hand.getHand().size(); i++){
            Card card = this.hand.getHand().get(i);
            System.out.println(i + 1 + ": " + card.getValue() + " of " + card.getCardSuit());
        }
        System.out.println();
    }


    public boolean isWinner() {
        return this.hand.getHand().size() == 0;
    }

    public String toString(){
        return this.playerId + "_" + this.name + "_";
    }

    public void drawCads(int num, DrawPile drawPile) {
        for(int i = 0; i < num; i++) {
            this.hand.getHand().add(drawPile.drawCard());
        }
    }
}
