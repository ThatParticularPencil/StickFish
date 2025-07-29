import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


// parent player public class 
abstract class Player {
    private String name;
    public Hand[] hands;
    protected double accuracy;

    public Player(String name) {
        this.name = name;
        this.buildHands();     //make empty hands
        this.accuracy = 0.0;
    }
    
    protected void buildHands() {       //adds hands to list
        hands = new Hand[2];
        hands[0] = new Hand();
        hands[1] = new Hand();
    }

    public void attack( Hand handFrom, Hand handTo) { //attack action
        //needs exception handling
        handTo.receive( handFrom.getFingers() );
    }

    public void distribute( Hand handFrom, Hand handTo, int count) { //distribute action
        //needs exception handling
        handFrom.lose(count); handTo.receive(count);
    }


    //print form
    public String toString() {
        String bothHands = this.name + ":   ";
        for(Hand hand: this.hands) {        //loop that draws hands
            bothHands += "|".repeat(hand.getFingers()) + "    ";
        }

        return bothHands;
    }

}

//Hand class that is accessible to Player
class Hand {
    private int fingers;
    
    // with fingers arg
    public Hand(int fingers) {
        // checkLegalFingerChange(fingers);
        this.fingers = fingers;
    }
    // no fingers constructor
    public Hand() {
        this(1);
    }

    public int getFingers() {
        return this.fingers;
    }

    //increasing finger count
    void receive( int count) {
        checkLegalFingerChange(count);
        this.fingers += count;
    }

    //decreasing finger count
    void lose (int count) {
        checkLegalFingerChange(-count);
        this.fingers -= count;
    }

    private void checkLegalFingerChange( int augment){ //augment is +-count
        if(this.fingers + augment > 5) {
            throw new IllegalArgumentException("cannot have more than 5 fingers");
        } 
        else if(this.fingers + augment < 0) {
            throw new IllegalArgumentException("cannot have less than 0 fingers");
        }
    }



}

