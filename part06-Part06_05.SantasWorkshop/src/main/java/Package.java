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

public class Package {
    
    private ArrayList<Gift> giftPackage;
    
    public Package() {
        this.giftPackage = new ArrayList<>();
        
    }
    
    public void addGift(Gift gift) {
        
        giftPackage.add(gift);
        
        
    }
    
    public int totalWeight() {
        
        int weight = 0;
        for (Gift gift: giftPackage) {
            weight += gift.getWeight();
        }
        
        return weight;
    }
    
}
