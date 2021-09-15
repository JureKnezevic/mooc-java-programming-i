/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
import java.util.ArrayList;

public class Hold {
    
    private int weight = 0;
    private int maxWeight;
    private ArrayList<Suitcase> hold = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight >= this.weight + suitcase.totalWeight()) {
            hold.add(suitcase);
            this.weight = weight + suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        String output = hold.size() + " suitcases (" + this.weight + " kg)";
        return output;
    }
}
