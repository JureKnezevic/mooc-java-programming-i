
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String printfirst = "";
        String printlast = "";
        String firstname = "";

        ArrayList<String> printables = new ArrayList<String>();

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {

                break;
            } else {

                firstname = input;
                printfirst = firstname;
            }
            String lastname = scanner.nextLine();
            printlast = lastname;
            String idn = scanner.nextLine();

            printables.add(printfirst + " " + printlast);

            infoCollection.add(new PersonalInformation(firstname, lastname, idn));
        }

        for (int i = 0; i < printables.size(); i++) {
            System.out.println(printables.get(i));
            
        }

    }
}
