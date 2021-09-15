/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class gradeCalc {

    private int sum;
    private int count;
    private double avg;
    private double percentage;
    private int passing = 0;
    private int participants = 0;
    
    public void add(int points) {

        this.sum = this.sum + points;
        this.count = this.count + 1;
        
        percentage(points);
        
    }

    public double getAvg() {
        
        if (this.count == 0) {
            return 0;
        }

        this.avg = (1.0 * this.sum) / (1.0 * this.count);

        return this.avg;
    }
    
    private double percentage(int points) {
        
        if (points >= 50) {
            this.passing++;
        }
        this.participants++;
        
        this.percentage = 100.0 * passing / participants;
        
        return percentage;
    }
    
    public double getPercentage() {
        
        return percentage;
    }

}
