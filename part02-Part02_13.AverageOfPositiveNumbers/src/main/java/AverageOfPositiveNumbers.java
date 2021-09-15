
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pNumCount = 0;
        int sum = 0;
        double avg = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0 && pNumCount > 0) {
                System.out.println(avg);
                break;
            } else if (num == 0 && pNumCount == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (num > 0) {

                sum = sum + num;
                pNumCount = pNumCount + 1;
                avg = 1.0 * sum / pNumCount;

            }

        }

    }
}
