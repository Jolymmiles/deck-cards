package CardPAc;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            for (int k = this.deck.length == 52 ? 0 : 4; k < Rank.values().length; k++) {
                Card card = new Card(suit, rankArray[k]);
                this.deck[i] = card;
                i += 1;
            }
        }
    }

    //Перетосовка
    public void reshuffle() {
        for (int card = 0; card < this.deck.length; card++) {
            int newPosition = random.nextInt(this.deck.length);
            Card timeCard = this.deck[card];
            this.deck[card] = this.deck[newPosition];
            this.deck[newPosition] = timeCard;
        }
    }

    //Сортировка
    public void sortDeck() {
        List<Rank>  test1 = new ArrayList<Rank>(Arrays.asList(Rank.values()));
        boolean flagSord = false;
        while (!flagSord) {
            flagSord=true;
            for (int i = 0; i < this.deck.length-1; i+=1) {
                if (test1.indexOf(this.deck[i].getRank()) > test1.indexOf(this.deck[i+1].getRank())) {
                    flagSord =false;
                    Card timeVar = this.deck[i];
                    this.deck[i] = this.deck[i+1];
                    deck[i+1] = timeVar;
                }
            }
        }

        List<Suit>  test = new ArrayList<Suit>(Arrays.asList(Suit.values()));
        boolean flagSorted =false;
        while (!flagSorted) {
            flagSorted=true;
            for (int i = 0; i < this.deck.length-1; i+=1) {
                if (test.indexOf(this.deck[i].getSuit()) > test.indexOf(this.deck[i+1].getSuit())) {
                    flagSorted =false;
                    Card timeVar = this.deck[i];
                    this.deck[i] = this.deck[i+1];
                    deck[i+1] = timeVar;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Колода: " + Arrays.toString(deck);
    }
}
