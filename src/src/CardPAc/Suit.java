package CardPAc;

public enum Suit{
    DIAMONDS("Бубны"), CLUBS("Трефы"), HEARTS("Червы"),  SPADES("Пики");
    private final String ruSuit;

    Suit(String ruSuit) {
        this.ruSuit = ruSuit;
    }

    public String getRuSuit() {
        return ruSuit;
    }
}
