/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Fitbyte {
    
    private double age;
    private double restingRate;
    
    
    public Fitbyte(int age, int restingHeartRate) {
        
        this.age = age;
        this.restingRate = restingHeartRate;
        
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        
        double targetPercentage = percentageOfMaximum;
        double targetHeartRate = ((206.3 - (0.711 * this.age)) - this.restingRate) * (targetPercentage) + this.restingRate; 
        
        return targetHeartRate;
    }
    
}
