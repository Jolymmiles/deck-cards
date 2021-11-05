package CardPAc;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> deck;
    Random random = new Random();

    //Конструктор
    public Deck(int size) {
        if (size != 36 & size != 52) {
            throw new ArrayIndexOutOfBoundsException("Колоды из " + size + " карт не существует.");
        }
        this.deck = new ArrayList<Card>();
        makeDeck();
    }

    //Создание колоды
    private void makeDeck() {
        Rank[] rankArray = Rank.values();
        for (Suit suit : Suit.values()) {
            for (int k = this.deck.size() == 52 ? 0 : 4; k < Rank.values().length; k++) {
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

    //Сортировка пузырьком
    public void sortDeck() {
        boolean flagSord = false;
        while (!flagSord) {
            flagSord=true;
            for (int i = 0; i < this.deck.size()-1; i+=1) {
                if (this.deck.get(i).getRank().ordinal() > this.deck.get(i + 1).getRank().ordinal()) {
                    flagSord =false;
                    Card timeVar = this.deck.get(i);
                    this.deck.set(i, this.deck.get(i + 1));
                    this.deck.set(i + 1, timeVar);
                }
            }
        }

        boolean flagSorted =false;
        while (!flagSorted) {
            flagSorted=true;
            for (int i = 0; i < this.deck.size()-1; i+=1) {
                if (this.deck.get(i).getSuit().ordinal() > this.deck.get(i + 1).getSuit().ordinal()) {
                    flagSorted =false;
                    Card timeVar = this.deck.get(i);
                    this.deck.set(i, this.deck.get(i + 1));
                    deck.set(i + 1, timeVar);
                }
            }
        }

    }

    //Сортировка компоратором
    public void sortComporator() {
        this.deck.sort(new CardComparator());
    }



    @Override
    public String toString() {
        return "Колода: " + deck;
    }


}
