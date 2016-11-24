/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baldrbeerpong;

import java.io.Serializable;

/**
 *
 * @author vincent
 */
public class Player implements Serializable {
    private String firstName;
    private String lastName;
    private int rating;
   
    private int wins = 0;
    private int losses = 0;
    private int games = 0;

    public Player(String first_name, String last_name) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.rating = 1000;
    }
    
    public void Win(){
        this.wins++;
        this.games++;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public void Lose(int ratingOpponent){
        this.losses++;
        this.games++;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRating() {
        return this.rating;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }


    public int getGames() {
        return games;
    }
    
    @Override
    public String toString() {
        return getFullName();
    }
}
