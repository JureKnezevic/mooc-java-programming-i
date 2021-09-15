
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ids = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String iden = scanner.nextLine();

            if (iden.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }
                       
            if (ids.contains(iden)) {
                continue;
            } else {
                items.add(new Item(iden, name));
            }
            
            ids.add(iden);
              
        }
        
        System.out.println("==Items==");

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            System.out.println("");

        }

    }
}
