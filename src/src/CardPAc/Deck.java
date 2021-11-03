package CardPAc;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] deck;
    Random random = new Random();

    //Конструктор
    public Deck(int size) {
        if (size != 36 & size != 52) {
            throw new ArrayIndexOutOfBoundsException("Такой колоды не существует!");
        }
        this.deck = new Card[size];
        makeDeck();
    }

    //Создание колоды
    private void makeDeck() {
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

    //Перетосовка
    public void reshuffle() {
        for (int card = 0; card < deck.length; card++) {
            int newPosition = random.nextInt(deck.length);
            Card timeCard = deck[card];
            deck[card] = deck[newPosition];
            deck[newPosition] = timeCard;
        }
    }

    @Override
    public String toString() {
        return "Колода: " + Arrays.toString(deck);
    }
}
