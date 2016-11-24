/* * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baldrbeerpong;
import components.RatingComparator;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author vincent
 */
public class Tournament implements Serializable{
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int kValue = 30;

    public Tournament(String name) {
        this.name = name;
    }
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void deletePlayer(Player player) {
        players.remove(player);
    }
    
    private double getExpectedValue(Player player1, Player player2) {
        double ratingDifference = (double) player2.getRating() - player1.getRating();
        System.out.println(ratingDifference);
        double temp = java.lang.Math.pow(10,(ratingDifference)/400);
        System.out.println(temp);
        return (double) 1/(1+(temp));
    }
   
    public void Game(Player winner, Player loser) {
        double expValueWinner = getExpectedValue(winner, loser);
        double expValueLoser = getExpectedValue(loser, winner);
        winner.setRating((int) (winner.getRating() + kValue * (1-expValueWinner)));
        loser.setRating((int) (loser.getRating() + kValue * (0-expValueLoser)));
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    public Integer getPosition(Player player) {
        Collections.sort(players, new RatingComparator());
        for (int i = 0; i < players.size(); i++) {
            Player player2 = players.get(i);
            if (player2.equals(player)) {
                return i+1;
            }
	}
        return 0;
    }
    
    public Integer getNumberOfPlayers() {
        return players.size();
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
}
