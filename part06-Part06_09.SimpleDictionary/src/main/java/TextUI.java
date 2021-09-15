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

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary words;
    
    public TextUI(Scanner temp1, SimpleDictionary temp2) {
        this.scanner = temp1;
        this.words = temp2;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
                
            }
            
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String translated = this.scanner.nextLine();
                
                if (this.words.translate(translated) == null) {
                    System.out.println("Word " + translated + " was not found");
                    continue;
                }
                System.out.println("Translation: " + this.words.translate(translated));
                continue;
            }
            
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                words.add(word, translation);
                continue;
            }
            
            System.out.println("Unknown command");
            

        }
    }
}
