import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Deck deck;
    private Player player;


    @Before

    public void before(){

        deck = new Deck();
        deck.populateDeck();
        player = new Player();

    }

    @Test

    public void dealCardTo_Player(){


    }



}
