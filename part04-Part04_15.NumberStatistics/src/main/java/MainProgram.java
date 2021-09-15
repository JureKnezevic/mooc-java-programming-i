
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Statistics statistics = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();

        
        System.out.println("Enter numbers:");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {

                break;
            }

            if (input % 2 == 0) {
                sumOfEven.addNumber(input);

            } else {
                sumOfOdd.addNumber(input);
            }
            //sumAll = sum(input) + sumAll;

            statistics.addNumber(input);

        }

        System.out.println("Sum: " + statistics.sum());

        System.out.println("Sum of even numbers: " + sumOfEven.sum());

        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());
    }
    /*
    public static int sum(int numb) {

        int sum = numb;
        return sum;

    }

    public static int sumOfEven(int numb) {

        int sum = numb;
        return sum;

    }

    
    public static int sumOfEven(int numb) {
        
        int sum = 0;
        
        if (numb % 2 == 0) {
            sum = 0 + numb;
            return sum;
        } else return sum;
        
        
    }
    
     
    public static int sumOfOdd(int numb) {

        int sum = numb;
        return sum;

    }
     */
}
