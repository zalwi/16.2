package logic;

import data.Card;
import data.CardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardDeckUtils {

    private CardDeckUtils() {
    };

    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";
    public static final String QUIT = "Q";

    public static void runMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do{
            System.out.println("-------------------------------------\n" +
                    "Podaj kod języka/Choose language code\n" +
                    "PL - Polish/Polski\n" +
                    "EN - English/Angielski\n" +
                    "Q  - Quit/Koniec");
            String countryCode = scanner.nextLine();
            switch(countryCode.toUpperCase()) {
                case POLISH -> {
                    List<String> cardsPL = CardDeckUtils.getListOfCards(CardDeckUtils.POLISH);
                    System.out.println("--- Talia 52 kart po polsku ---");
                    for (int i = 1; i <= cardsPL.size(); i++) {
                        System.out.println(i + ".\t" + cardsPL.get((i - 1)));
                    }
                }
                case ENGLISH -> {
                    List<String> cardsEN = CardDeckUtils.getListOfCards(CardDeckUtils.ENGLISH);
                    System.out.println("--- 52 Cards in English ---");
                    for (int i = 1; i <= cardsEN.size(); i++) {
                        System.out.println(i + ".\t" + cardsEN.get((i - 1)));
                    }
                }
                case QUIT -> {
                    System.out.println("--- koniec ---");
                    loop=false;
                }
                default -> {
                    System.out.println("Wybrano zły kod: " + countryCode);
                }
            }
        } while (loop);
    }

    public static List<String> getListOfCards(String language) {
        List<String> listOfCards = new ArrayList<>();
        CardDeck[] cardDeckValues = CardDeck.values();
        switch (language) {
            case POLISH -> {
                for (CardDeck color : cardDeckValues) {
                    for (Card card : color.getCards()) {
                        listOfCards.add(card.getSymbol() + color.getSymbol() + ", "
                                + card.getDescriptionPL() + " " + color.getDescriptionPL());
                    }
                }
            }
            case ENGLISH -> {
                for (CardDeck color : cardDeckValues) {
                    for (Card card : color.getCards()) {
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
