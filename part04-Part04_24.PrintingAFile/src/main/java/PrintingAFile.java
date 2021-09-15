
import java.util.Scanner;
import java.nio.file.Paths;


public class PrintingAFile {

    public static void main(String[] args) {
        
        try ( Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            
            while (scanner.hasNextLine()) {
                String redak = scanner.nextLine();
                
                System.out.println(redak);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
