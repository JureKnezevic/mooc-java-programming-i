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

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {

        this.room.add(person);
    }

    public boolean isEmpty() {

        if (room.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Person> getPersons() {

        return this.room;
    }

    public Person shortest() {
        
        if (room.isEmpty()) {
            return null;
        }
        int height1 = 0;
        int height2 = 0;
        int shorter = 0;
        int theshortest = 0;
        String nameShortest = "";
        Person shrt = new Person(nameShortest, theshortest);
        
        for (Person hgt : room) {
            height2 = height1;
            height1 = hgt.getHeight();
            
            if (height2 == 0) {
                height2 = height1;
                shorter = height1;
                theshortest = height1;
                nameShortest = hgt.getName();
            }
            if (height1 > height2) {
                shorter = height2;
                
            } else if (height1 < height2) {
                shorter = height1;
            }
            if (shorter < theshortest) {
                theshortest = shorter;
                nameShortest = hgt.getName();
                shrt = new Person(nameShortest, theshortest);
            }
            if (shorter == theshortest) {
                shrt = new Person(nameShortest, theshortest);
            }
        }
        return shrt;
    }
    
    public Person take() {
        
        if (this.room.isEmpty()) {
            return null;
        }
        Person removed = shortest();
        this.room.remove(shortest());
        return removed;
        
    }
}
