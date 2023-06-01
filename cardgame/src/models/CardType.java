package models;

public enum CardType {
    NUMBER, ACTION;

    private static CardType[] cardTypes = CardType.values();
    public static CardType getCardType(int i) {
        return cardTypes[i];
    }
}
