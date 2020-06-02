package logic;

import data.Card;
import data.CardDeck;

import java.util.ArrayList;
import java.util.List;

public class CardDeckUtils {

    private CardDeckUtils(){};

    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";

    public static List<String> getListOfCards(String language){
        List<String> listOfCards = new ArrayList<>();
        CardDeck[] cardDeckValues =CardDeck.values();
        switch (language){
            case POLISH -> {
                for(CardDeck color: cardDeckValues){
                    for(Card card: color.getCards()){
                        listOfCards.add(card.getSymbol() + color.getSymbol() + ", "
                                        + card.getDescriptionPL() + " " + color.getDescriptionPL());
                    }
                }
            }
            case ENGLISH -> {
                for(CardDeck color: cardDeckValues){
                    for(Card card: color.getCards()){
                        listOfCards.add(card.getSymbol() + color.getSymbol() + ", "
                                + card.getDescriptionEN() + " of " + color.getDescriptionEN());
                    }
                }
            }
            default -> {
                listOfCards = null;
            }
        }
        return listOfCards;
    }
}
