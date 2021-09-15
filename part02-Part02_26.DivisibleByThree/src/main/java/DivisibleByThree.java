
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(num1, num2);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {

        while (beginning >= end) {

            int i = 0;
            int print = beginning;
            if (beginning % 3 == 0) {
                System.out.println(print);
            }
            i = i + 1;
            beginning = beginning - i;
            

        } 
        
        while (beginning <= end) {
            
            int i = 0;
            int print = beginning;
            if (beginning % 3 == 0) {
                System.out.println(print);
            }
            
            i = i + 1;
            beginning = beginning + i;
            

        }

    }
}
