/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeb
 */
public class Timer {
    private ClockHand hundrethsHand;
    private ClockHand secondsHand;
    
    public Timer() {
        this.hundrethsHand = new ClockHand(100);
        this.secondsHand = new ClockHand(60);
    }
    
    public String toString() {
        return secondsHand + ":" + hundrethsHand;
    }
    
    public void advance() {
        this.hundrethsHand.advance();
        if(this.hundrethsHand.value() == 0) {
            this.secondsHand.advance();
        }
    }
    
}
