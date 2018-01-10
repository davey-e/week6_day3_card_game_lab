import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private Deck deck;


    public Dealer(Deck deck){
        this.deck = deck;
    }


    public void dealCard(Player player) {
       Card cardToDeal = deck.removeCard();
       player.addCardToHand(cardToDeal);
    }

    public Deck getDeck() {
        return deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deck.cards);
    }
}
