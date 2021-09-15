
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recepti = new ArrayList<>();

        System.out.println("File to read:");
        String filename = scanner.nextLine();

        try ( Scanner read = new Scanner(Paths.get(filename))) {
            String row = "";

            while (read.hasNextLine()) {
                String recept = read.nextLine();
                if (row.equals("")) {
                    row = recept;
                } else if (!row.equals("")) {
                    if (!recept.equals("")) {
                        row = row + "," + recept;
                    }
                }
                if (recept.isEmpty() || !read.hasNextLine()) {
                    recepti.add(row);
                    row = "";
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("");

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        System.out.println("");

        System.out.println("Enter Command:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                System.out.println("Recipes:");
                for (int n = 0; n < recepti.size(); n++) {
                    String[] parts = recepti.get(n).split(",");
                    System.out.println(parts[0] + ", cooking time: " + Integer.valueOf(parts[1]));
                }
            } else if (input.equals("find name")) {
                System.out.println("Searched word:");
                input = scanner.nextLine();
                for (int n = 0; n < recepti.size(); n++) {
                    String[] parts = recepti.get(n).split(",");
                    String name = parts[0];
                    if (name.contains(input)) {
                        System.out.println(parts[0] + ", cooking time: " + Integer.valueOf(parts[1]));
                    }
                }
            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                input = scanner.nextLine();
                for (int n = 0; n < recepti.size(); n++) {
                    String[] parts = recepti.get(n).split(",");
                    int time = Integer.valueOf(parts[1]);
                    if (Integer.valueOf(input) >= time) {
                        System.out.println(parts[0] + ", cooking time: " + time);
                    }
                }
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient:");
                input = scanner.nextLine();
                
                for (int n = 0; n < recepti.size(); n++) {
                    String[] parts = recepti.get(n).split(",");
                    ArrayList<String> ingredients = new ArrayList<>();
                    String name = parts[0];
                    String time = parts[1];
                    String ingr = "";
                    for (int i = 2; i < parts.length; i++) {
                        ingr = ingr + " " + parts[i];
                    }
                    ingredients.add(ingr);
                    
                    String[] ingredient = ingredients.get(0).split(" ");

                    for (int m = 0; m < ingredient.length; m++) {
                        if (ingredient[m].equals(input)) {
                            System.out.println(name + ", cooking time: " + time);
                        }
                    }
                }
            }
        }
    }
}
