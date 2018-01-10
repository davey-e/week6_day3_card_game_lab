import java.util.ArrayList;

public class Dealer {

    private Deck deck;


    public Dealer(Deck deck){
        this.deck = deck;
    }


    public void dealCard(Player player) {
       Card cardToDeal = deck.removeCard();
       player.addCardToHand(cardToDeal);
    }
}
