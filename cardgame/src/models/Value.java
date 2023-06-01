package models;

public enum Value {
    ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

    private static Value[] values = Value.values();
    public static Value getValue(int i) {
        return values[i];
    }
}
