package CardPAc;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> deck;
    private final int size;
    Random random = new Random();

    //Конструктор
    public Deck(int size) {
        if (size != 36 & size != 52) {
            throw new ArrayIndexOutOfBoundsException("Колоды из " + size + " карт не существует.");
        }
        this.deck = new ArrayList<Card>(size);
        this.size = size;
        makeDeck();
    }

    //Создание колоды
    private void makeDeck() {
        Rank[] rankArray = Rank.values();
        int getSizeofDeck = this.size == 52 ? 0 : 4;
        for (Suit suit : Suit.values()) {
            for (int k = getSizeofDeck; k < Rank.values().length; k++) {
                Card card = new Card(suit, rankArray[k]);
                this.deck.add(card);
            }
        }
    }

    //Перетосовка
    public void reshuffle() {
        for (int card = 0; card < this.deck.size(); card++) {
            int newPosition = random.nextInt(this.deck.size());
            Card timeCard = this.deck.get(card);
            this.deck.set(card, this.deck.get(newPosition));
            this.deck.set(newPosition, timeCard);
        }
    }


    //Сортировка компоратором
    public void sortComporator() {
        Collections.sort(this.deck);
    }


    @Override
    public String toString() {
        return "Колода: " + deck;
    }


}
