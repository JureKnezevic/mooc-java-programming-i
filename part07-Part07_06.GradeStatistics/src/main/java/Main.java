
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter point totals, -1 stops:");
        String input = "";
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        

        while (true) {
            
            input = scanner.nextLine();
                        
            if (input.equals("-1")) {
                System.out.println(grades.toString());
                grades.printStars();
                break;
            } else {
                grades.Grades(Integer.valueOf(input));
                
            }

        }
    }
}