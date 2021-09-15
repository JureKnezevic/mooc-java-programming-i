
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int prvi = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int drugi = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (1.0 * prvi + drugi ) / 2);

    }
}
