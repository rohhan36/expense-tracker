package models;

public class Card {
    private CardSuit cardSuit;
    private Value cardValue;
    private CardType cardType;

    public Card(){}

    public Card(CardType cardType, CardSuit cardSuit, Value cardValue) {
        this.cardType = cardType;
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public String toString() {
        return this.cardType + "_" + this.cardSuit + "_" + this.cardValue;
    }

    public boolean isActionCard(){
        return this.getValue().equals(Value.QUEEN) || this.getValue().equals(Value.JACK) ||
                this.getValue().equals(Value.ACE) || this.getValue().equals(Value.KING);
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public Value getValue() {
        return cardValue;
    }

    public void setValue(Value value) {
        this.cardValue = value;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}


