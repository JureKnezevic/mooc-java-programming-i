
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int prvi = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int drugi = Integer.valueOf(scanner.nextLine());
        
        System.out.println(prvi + " + " + drugi + " = " + (prvi + drugi));
        System.out.println(prvi + " - " + drugi + " = " + (prvi - drugi));
        System.out.println(prvi + " * " + drugi + " = " + (prvi * drugi));
        System.out.println(prvi + " / " + drugi + " = " + (1.0 * prvi / drugi));

    }
}
