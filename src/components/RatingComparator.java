/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import baldrbeerpong.Player;
import java.util.Comparator;

/**
 *
 * @author vincent
 */
public class RatingComparator implements Comparator{
 
    @Override
    public int compare(Object player1, Object player2){    
       
        Integer player1Rating = ((Player)player1).getRating();        
        Integer player2Rating = ((Player)player2).getRating();
       
        //uses compareTo method of String class to compare names of the employee
        return player2Rating.compareTo(player1Rating);
   
    }
}
