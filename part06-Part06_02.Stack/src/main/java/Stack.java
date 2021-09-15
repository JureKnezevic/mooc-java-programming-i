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

public class Stack {
    
    private ArrayList<String> values;
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        
        if (values.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        
        values.add(value);
        
    }
    
    public ArrayList<String> values() {
        
        return values;
    }
    
    public String take() {
        
        int i = values.size();
        String last = values.get(i - 1);
        values.remove(i - 1);
        
        return last;
        
    }
    
}
