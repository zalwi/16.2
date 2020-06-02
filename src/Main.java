import logic.CardDeckUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cardsPL = CardDeckUtils.getListOfCards(CardDeckUtils.POLISH);
        List<String> cardsEN = CardDeckUtils.getListOfCards(CardDeckUtils.ENGLISH);

        System.out.println("--- Talia 52 kart po polsku ---");
        for(int i = 1; i<= cardsPL.size(); i++){
            System.out.println(i + ".\t" + cardsPL.get((i-1)));
        }
        System.out.println("--- Talia 52 kart po angielsku ---");
        for(int i = 1; i<= cardsEN.size(); i++){
            System.out.println(i + ".\t" + cardsEN.get((i-1)));
        }
        System.out.println("--- koniec ---");

    }
}
