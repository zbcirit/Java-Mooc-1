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

public class Room {
    ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person shortest = this.list.get(0);
        for (Person person:this.list) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.list.remove(shortest);
        return shortest;
    }
}
