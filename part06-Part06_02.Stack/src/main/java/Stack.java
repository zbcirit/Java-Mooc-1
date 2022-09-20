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
public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> stackCopy = this.stack;
        return stackCopy;
    }
    
    public String take() {
        return this.stack.remove(this.stack.size()-1);
    }
    

}
