/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeb
 */
public class Team {
    private String name;
    private int games;
    private int wins;
    private int losses;
    
    public Team(String name) {
        this.name = name;
        this.games = 0;
        this.wins = 0;
        this.losses = 0;
    }
    
    public void addGames() {
        this.games++;
    }
    
    public void addWin() {
        this.wins++;
    }
    
    public void addLoss() {
        this.losses++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getGames() {
        return this.games;
    }
    
    public int getWins() {
        return this.wins;
    }
    
    public int getLosses() {
        return this.losses;
    }
    
    public String toString() {
        return this.name + " played " + this.games + " games, of which " 
                + this.wins + " was won and " + this.losses + " was lost.";
    }
}
