/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeb
 */
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight) {
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.hold.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }
    public void printItems () {
        for (Suitcase suitcase: this.hold) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.hold.size() + " suitcases (" + this.currentWeight + " kg)" ;
    }
}
