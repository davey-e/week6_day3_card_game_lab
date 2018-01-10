import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Deck deck;
    private Player player;
    private Dealer dealer;


    @Before

    public void before(){

        deck = new Deck();
        deck.populateDeck();
        player = new Player();
        dealer = new Dealer(deck);

    }

    @Test
    public void canDealCardToPlayer(){
        assertEquals(52, deck.getNumberOfCards());
        assertEquals(0, player.cardCount());
        dealer.dealCard(player);
        assertEquals(51, deck.getNumberOfCards());
        assertEquals(1, player.cardCount());
    }



}
