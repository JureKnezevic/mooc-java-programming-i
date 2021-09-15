
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> latinNames = new ArrayList<>();
        ArrayList<Integer> observationCount = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("?");
            String input = scan.nextLine();

            if (input.equals("Add")) {
                System.out.println("Name:");
                input = scan.nextLine();
                names.add(input);
                System.out.println("Name in Latin:");
                input = scan.nextLine();
                latinNames.add(input);
                observationCount.add(0);
            }

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("All")) {
                for (int i = 0; i < names.size(); i++) {
                    System.out.println(names.get(i) + " (" + latinNames.get(i) + "): " + observationCount.get(i) + " observations");
                }
            }

            if (input.equals("One")) {
                System.out.println("Bird?");
                input = scan.nextLine();
                for (int i = 0; i < names.size(); i++) {
                    if (input.equals(names.get(i))) {
                        System.out.println(names.get(i) + " (" + latinNames.get(i) + "): " + observationCount.get(i) + " observations");
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }

            if (input.equals("Observation")) {
                System.out.println("Bird?");
                input = scan.nextLine();
                for (int i = 0; i < names.size(); i++) {
                    if (input.equals(names.get(i))) {
                        int count = observationCount.get(i);
                        count++;
                        observationCount.set(i, count);
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
        }
    }
}
