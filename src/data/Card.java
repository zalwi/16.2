package data;

public enum Card {
    TWO(    "Two",      "Dwójka",       "2"),
    THREE(  "Three",    "Trójka",       "3"),
    FOUR(   "Four",     "Czwórka",      "4"),
    FIVE(   "Five",     "Piątka",       "5"),
    SIX(    "Six",      "Szóstka",      "6"),
    SEVEN(  "Seven",    "Siódemka",     "7"),
    EIGHT(  "Eight",    "Ósemka",       "8"),
    NINE(   "Nine",     "Dziewiątka",   "9"),
    TEN(    "Ten",      "Dziesiątka",   "10"),
    JACK(   "Jack",     "Walet",        "J"),
    QUEEN(  "Queen",    "Królowa",      "Q"),
    KING(   "King",     "Król",         "K"),
    ACE(    "Ace",      "As",           "A");

    private String descriptionEN;
    private String descriptionPL;
    private String symbol;

    private Card(String descriptionEN, String descriptionPL, String symbol){
        this.descriptionEN = descriptionEN;
        this.descriptionPL = descriptionPL;
        this.symbol = symbol;
    }

    public String getDescriptionEN() {
        return descriptionEN;
    }

    public String getDescriptionPL() {
        return descriptionPL;
    }

    public String getSymbol() {
        return symbol;
    }


}
