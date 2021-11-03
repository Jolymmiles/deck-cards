package CardPAc;

import java.util.Arrays;

public class Deck {
    private Card[] deck;

    public Deck(int size) {
        if (size != 36 & size != 52) {
            throw new ArrayIndexOutOfBoundsException("Такой колоды не существует!");
        }
        this.deck = new Card[size];
    }

    public void makeDeck() {
        int i = 0;
        Rank[] rankArray = Rank.values();
        for (Suit suit : Suit.values()) {
            for (int k = deck.length == 52 ? 0 : 4; k < Rank.values().length; k++) {
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
