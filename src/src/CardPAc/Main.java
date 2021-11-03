package CardPAc;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(36);
        try {
            deck.makeDeck();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(deck);
    }
}
