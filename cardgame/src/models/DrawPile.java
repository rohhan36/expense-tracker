package models;

import java.util.List;
import java.util.Stack;

public class DrawPile {
    private Stack<Card> drawPile;

    public DrawPile(List<Card> deck) {
        drawPile = new Stack<>();
        for(Card card : deck) {
            drawPile.push(card);
        }
    }
    public Card drawCard() {
        if(drawPile.isEmpty()) {
            System.out.println("---------- GAME OVER : DRAW PILE IS EMPTY : NO ONE WINS ----------");
            System.exit(0);
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
