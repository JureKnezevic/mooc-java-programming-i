
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int n = 0;
        int sum = 0;

        double average = 0;
        String longer = "";

        while (true) {

            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.equals("")) {

                System.out.println("Longest name: " + longer);
                System.out.println("Average of thebirth years: " + average);
                break;
            } else {

                input = pieces[i];

                if (longer.length() < input.length()) {

                    longer = input;
                }

            }

            n++;

            sum = sum + Integer.valueOf(pieces[i + 1]);
            int count = n;

            average = 1.0 * sum / count;

        }

    }
}
