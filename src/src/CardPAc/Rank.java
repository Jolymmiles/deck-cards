package CardPAc;

public enum Rank{
    TWO("Двойка"), THREE("Тройка"), FOUR("Четверка"), FIVE("Пятерка"), SIX("Шестерка"), SEVEN("Семерка"),
    EIGHT("Восьмерка"), NINE("Девятка"), TEN("Десятка"), KNAVE("Валет"), QUEEN("Королева"), KING("Король"), ACE("Туз");
    private final String ruRank;

    Rank(String ruRank) {
        this.ruRank = ruRank;
    }

    public String getRuRank() {
        return ruRank;
    }
}
