package CardPAc;

public class Card {
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
        return "\nCard:" +
                "\nSuit: " + rank +
                "\nRank: " + suit + "\n";
    }
}
