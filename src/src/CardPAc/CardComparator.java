package CardPAc;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {


    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit().ordinal() == card2.getSuit().ordinal()) {
            if (card1.getRank().ordinal() == card2.getRank().ordinal()) {
                return 0;
            } if (card1.getRank().ordinal() > card2.getRank().ordinal()) {
                return 1;
            } else return 0;
        }
        if (card1.getSuit().ordinal() > card2.getSuit().ordinal()) {
            return 1;
        }
        else {
            return -1;
        }
    }

}