import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();

    }


    public int cardCount() {
        return this.hand.size();
    }
}
