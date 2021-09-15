
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int num = Integer.valueOf(scanner.nextLine());

        int fac = 1;
        int i = 1;

        for (i = 1; i <= num; i++) {

            fac = i * fac;

        }

        System.out.println("Factorial: " + fac);

    }
}
