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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.totalWeight()+ item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item:items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item:items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    public void printItems() {
        for (Item item:items) {
            System.out.println(item);
        }
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1 ) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
