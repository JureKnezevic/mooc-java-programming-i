
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;

        while (true) {
            System.out.println("Give a number:");
            num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            } else if (num1 < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else {
                System.out.println(Math.pow(num1, 2));
            }

        }
    }
}
