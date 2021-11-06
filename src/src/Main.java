import CardPAc.Deck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //Создание колоды
            Deck deck = new Deck(scanner.nextInt());
            //Вывод колоды
            System.out.println(deck);
            System.out.println("----------------------------------------------------------------");
            //Перетасовка колоды
            deck.reshuffle();
            //Вывод колоды
            System.out.println(deck);
            System.out.println("----------------------------------------------------------------");
            //Сортировка колоды компоратором
            deck.sortComporator();
            //Вывод колоды
            System.out.println(deck);
            System.out.println("----------------------------------------------------------------");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
