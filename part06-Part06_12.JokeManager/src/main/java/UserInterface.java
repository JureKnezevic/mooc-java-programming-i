/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager joke, Scanner scanner) {
        
        this.jokes = joke;
        this.scanner = scanner;

    }
    
    public void start() {
        
        while (true) {
        
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list a joke");
        System.out.println("X - stop");
        
        String input = "";
        
            input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            }
            
            if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                input = scanner.nextLine();
                jokes.addJoke(input);
                
            }
            
            if (input.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokes.drawJoke());
                
            }
            
            if (input.equals("3")) {
                jokes.printJokes();
                
            }
        }
    }
    
}
