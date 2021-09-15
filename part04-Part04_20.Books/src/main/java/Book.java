/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
public class Book {

    private String name;
    private int pages;
    private int years;

    public Book(String inputName, int inputPages, int inputYear) {
        
        this.name = inputName;
        this.pages = inputPages;
        this.years = inputYear;

    }
    
    public String getName() {
        
        return this.name;
    }
    
    public int getPages() {
        
        return this.pages;
    }
    
    public int getYear() {
        
        return this.years;
    }
    
    
    public String toString() {
        return this.name + ", " + this.pages + " pages" + ", " + this.years;
    }
}