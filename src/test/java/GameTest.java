import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    private Game game;
    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player();
        player2 = new Player();
        dealer = new Dealer(deck);
        game = new Game();
    }

    @Test
    public void canGetPlayerCardPointsValue(){
        dealer.dealCard(player1);
        assertEquals(1, game.getCardPointsValue(player1));
    }

    @Test
    public void canCheckWinner(){
        dealer.dealCard(player1);
        dealer.dealCard(player2);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        assertEquals(player2, game.checkWinner(players));
    }
}
