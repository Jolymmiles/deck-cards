package CardPAc;


import java.util.*;

public class Deck {
    private final Card[] deck;
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
        boolean flagSord = false;
        while (!flagSord) {
            flagSord=true;
            for (int i = 0; i < this.deck.length-1; i+=1) {
                if (this.deck[i].getRank().ordinal() > this.deck[i+1].getRank().ordinal()) {
                    flagSord =false;
                    Card timeVar = this.deck[i];
                    this.deck[i] = this.deck[i+1];
                    deck[i+1] = timeVar;
                }
            }
        }

        boolean flagSorted =false;
        while (!flagSorted) {
            flagSorted=true;
            for (int i = 0; i < this.deck.length-1; i+=1) {
                if (this.deck[i].getSuit().ordinal() > this.deck[i+1].getSuit().ordinal()) {
                    flagSorted =false;
                    Card timeVar = this.deck[i];
                    this.deck[i] = this.deck[i+1];
                    deck[i+1] = timeVar;
                }
            }
        }

    }

    //Тест
    public void sortComporator() {
        CardComparator cardComparator = new CardComparator();
        List<Card> decks = new ArrayList<Card>(Arrays.asList(deck));
        decks.sort(cardComparator);
        System.out.println(decks);
    }



    @Override
    public String toString() {
        return "Колода: " + Arrays.toString(deck);
    }


}
