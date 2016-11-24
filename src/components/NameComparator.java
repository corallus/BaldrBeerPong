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
public class NameComparator implements Comparator{
 
    @Override
    public int compare(Object player1, Object player2){    
       
        String player1Name = ((Player)player1).getFullName();        
        String player2Name = ((Player)player2).getFullName();
       
        //uses compareTo method of String class to compare names of the employee
        return player1Name.compareTo(player2Name);
   
    }
}
