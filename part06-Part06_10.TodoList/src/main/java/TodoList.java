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

public class TodoList {

    private ArrayList<String> things;

    public TodoList() {
        this.things = new ArrayList();

    }

    public void add(String task) {

        things.add(task);

    }

    public void print() {

        for (int i = 0; i < things.size(); i++) {
            
            System.out.println(i + 1 + ": " + this.things.get(i));
        }

    }

    public void remove(int number) {
        
        this.things.remove(number - 1);

    }

}
