package models;

import exeptions.DrawPileEmptyException;

import java.util.List;
import java.util.Stack;

public class DrawPile {
    private Stack<Card> drawPile;

    public DrawPile(){}

    public DrawPile(List<Card> deck) {
        drawPile = new Stack<>();
        for(Card card : deck) {
            drawPile.push(card);
        }
    }
    public Card drawCard() throws DrawPileEmptyException {
        if(drawPile.isEmpty()) {
            throw new DrawPileEmptyException();
        }

        return drawPile.pop();
    }

    public boolean isEmpty(){
        return drawPile.isEmpty();
    }

    public Stack<Card> getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(Stack<Card> drawPile) {
        this.drawPile = drawPile;
    }
}
