package data;

public enum CardDeck {

    CLUBS(      "żołądź",   "clubs",    "Trefl","♣"),
    DIAMONDS(   "dzwonek",  "diamonds", "Karo", "♦"),
    HEARTS(     "serce",    "hearts",   "Kier", "♥"),
    SPADES(     "wino",     "spades",   "Pik",  "♠");

    private Card[] cards;
    private String descriptionPL;
    private String descriptionEN;
    private String classicDescPL;
    private String symbol;

    private CardDeck(String descriptionPL, String descriptionEN, String classicDescPL, String symbol){
        this.cards = Card.values();
        this.descriptionPL = descriptionPL;
        this.descriptionEN = descriptionEN;
        this.classicDescPL = classicDescPL;
        this.symbol = symbol;
    }

    public Card[] getCards() {
        return cards;
    }

    public String getDescriptionPL() {
        return descriptionPL;
    }

    public String getDescriptionEN() {
        return descriptionEN;
    }

    public String getClassicDescPL() {
        return classicDescPL;
    }

    public String getSymbol() {
        return symbol;
    }
}
