
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int num = 0;
        int sum = 0;
        double avg = 0;
        
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            } else {
                
                sum = sum + num;
                count = count + 1;
                
            }
            avg = 1.0 * sum / count;
                
        }
        System.out.println("Average of the numbers: " + avg);
    }
}
