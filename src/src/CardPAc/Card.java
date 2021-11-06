package CardPAc;

public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;


    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "\nКарта(" + "Масть: " + suit.getRuSuit() + ", Номинал: " + rank.getRuRank() + ")";
    }


    @Override
    public int compareTo(Card o) {
        if (this.getSuit().equals(o.getSuit())) {
            if (this.getRank().equals(o.getRank())) {
                return 0;
            } if (this.getRank().ordinal() > o.getRank().ordinal()) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.getSuit().ordinal() > o.getSuit().ordinal()) {
            return 1;
        } else {
            return -1;
        }
    }
}
