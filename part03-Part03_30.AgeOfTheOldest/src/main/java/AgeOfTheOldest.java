
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int age = 0;
        int i = 1;

        while (true) {

            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.equals("")) {

                System.out.println("Age of the oldest: " + oldest);
                break;
            } else if (input.contains(",")) {

                age = Integer.valueOf(pieces[i]);
                if (age > oldest) {
                    oldest = age;
                }

            }

        }

    }
}
