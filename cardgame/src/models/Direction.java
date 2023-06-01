package models;

public enum Direction {
    POSITIVE, NEGATIVE;

    public Direction toggle(Direction dir) {
        return dir == NEGATIVE ? POSITIVE : NEGATIVE;
    }
}
