package CardPAc;

import java.util.Arrays;

public class Deck {
    private Card[] deck;
    private int size;

    public Deck(int size) {
        this.deck = new Card[size];
        this.size = size;
    }

    public void makeDeck() {
        if (this.size != 36 & this.size != 52) {
            throw new ArrayIndexOutOfBoundsException("Такой колоды не существует!");
        }
        int i = 0;
        Rank[] rankArray = Rank.values();
        for (Suit suit : Suit.values()) {
            for (int k = size == 52 ? 0 : 4; k < Rank.values().length; k++) {
                Card card = new Card(suit, rankArray[k]);
                deck[i] = card;
                i += 1;
            }
        }
    }


    @Override
    public String toString() {
        return "Колода: " + Arrays.toString(deck);
    }
}
