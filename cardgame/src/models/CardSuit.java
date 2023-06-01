package models;

public enum CardSuit {
    HEART, CLUB, SPADE, DIAMOND;

    private static CardSuit[] cardSuits = CardSuit.values();
    public static CardSuit getCardSuit(int i) {
        return cardSuits[i];
    }
}
