
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            
            if (input.equals("")) {
                break;
            } else {
                int i = pieces.length - 1;
                System.out.println(pieces[i]);
            }
        
        }
    }
}
