import java.util.ArrayList;

public class Game {

    public int getCardPointsValue(Player player){
        int pointsValue = 0;
        int numberOfCards = player.showHand().size();
        for(int i =0; i < numberOfCards; i++){
            Card card = player.showHand().get(i);
            pointsValue = pointsValue + card.getRank().getPointValue();
        }
        return pointsValue;
    }

    public Player checkWinner(ArrayList<Player> players){
        Player winner = new Player();
        int highestValue = 0;
        int numberOfPlayers = players.size();
        for(int i = 0; i < numberOfPlayers; i++){
            int playerPointsValue=0;
            Player currentPlayer = players.get(i);
            playerPointsValue = getCardPointsValue(currentPlayer);
            if(playerPointsValue > highestValue){
                highestValue = playerPointsValue;
                winner = currentPlayer;
            }
        }
        return winner;
    }
}
