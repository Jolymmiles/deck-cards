package CardPAc;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(36);
        try {
            //Создание колоды
            System.out.println(deck);

            //Перетасовка
            deck.reshuffle();
            System.out.println(deck);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
