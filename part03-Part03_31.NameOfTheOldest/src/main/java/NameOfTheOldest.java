
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int age = 0;
        int i = 1;
        String nameOldest = "";

        while (true) {

            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.equals("")) {

                System.out.println("Name of the oldest: " + nameOldest);
                break;
            } else if (input.contains(",")) {

                age = Integer.valueOf(pieces[i]);
                if (age > oldest) {
                    oldest = age;
                    nameOldest = pieces[i - 1];

                }

            }

        }

    }
}
