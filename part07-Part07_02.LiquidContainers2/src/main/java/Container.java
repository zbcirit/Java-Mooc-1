/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeb
 */
public class Container {
    private int amount;
    private final int MAX_AMOUNT;
    
    public Container() {
        this.amount = 0;
        this.MAX_AMOUNT = 100;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if ( amount > 0) {
            if (amount + this.amount > this.MAX_AMOUNT) {
                this.amount = this.MAX_AMOUNT;
            } else {
                this.amount = (this.amount + amount);
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (amount > this.amount) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }
        }
    }
    
    @Override 
    public String toString() {
        return this.amount + "/" + this.MAX_AMOUNT;
    }
    
}
