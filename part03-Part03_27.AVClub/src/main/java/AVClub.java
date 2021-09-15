
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            
            if (text.equals("")) {
                break;
            }
                                    
            for (i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
               
            }
             
        }

    }
}
