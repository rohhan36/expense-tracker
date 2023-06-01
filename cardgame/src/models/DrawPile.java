package models;

import java.util.Stack;

public class DrawPile {
    private Stack<Card> drawPile;

    public Stack<Card> getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(Stack<Card> drawPile) {
        this.drawPile = drawPile;
    }
}
