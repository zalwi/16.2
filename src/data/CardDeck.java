package data;

import java.util.ArrayList;
import java.util.List;

public enum CardDeck {

    CLUBS(      "żołądź",   "clubs",    "Trefl","♣"),
    DIAMONDS(   "dzwonek",  "diamonds", "Karo", "♦"),
    HEARTS(     "serce",    "hearts",   "Kier", "♥"),
    SPADES(     "wino",     "spades",   "Pik",  "♠");

    private Card[] cards;
    private String descriptionPL;
    private String descriptionEN;
    private String popularDescPL;
    private String symbol;

    private CardDeck(String descriptionPL, String descriptionEN, String popularDescPL, String symbol){
        this.cards = Card.values();
        this.descriptionPL = descriptionPL;
        this.descriptionEN = descriptionEN;
        this.popularDescPL = popularDescPL;
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

    public String getPopularDescPL() {
        return popularDescPL;
    }

    public String getSymbol() {
        return symbol;
    }
}
