import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before

    public void before(){
        player = new Player();
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test

    public void playerHandStartsEmpty(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canAddCardToPlayerHand(){
        player.addCardToHand(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void canShowHand(){
        player.addCardToHand(card);
        ArrayList<Card> expectedHand = new ArrayList<>();
        expectedHand.add(card);
        assertEquals(expectedHand, player.showHand());
    }
}
