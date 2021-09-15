
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();

        try ( Scanner searchFile = new Scanner(Paths.get(file))) {
            while (searchFile.hasNextLine()) {
                numbers.add(Integer.valueOf(searchFile.nextLine()));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        for (int i = 0; i < numbers.size(); i++) {
            
            if (lowerBound <= numbers.get(i) && numbers.get(i) <= upperBound) {
                count++;
            }
            
        }
        
        System.out.println("Numbers: " + count);
        
    }
}


