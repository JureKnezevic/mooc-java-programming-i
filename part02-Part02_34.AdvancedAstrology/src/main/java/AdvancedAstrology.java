
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int times = 1;
        String printStarsS = "";

        while (times <= number) {

            printStarsS = printStarsS + "*";

            times++;

        }

        System.out.println(printStarsS);

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int space = 1;
        String spaces = "";

        while (space <= number) {
            spaces = spaces + " ";
            space++;

        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int nstars = 1;
        
        

        while (nstars <= size) {

            int nspaces = size - nstars;
            printSpaces(nspaces);
            printStars(nstars);

            nstars++;

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int nstars = 1;
        int center = 0;
        int nspaces = 0;

        while (center < height) {

            nspaces = height - center - 1;
            printSpaces(nspaces);
            printStars(nstars);

            nstars = nstars + 2;
            center++;

        }
        
        nspaces = height - 2;
        printSpaces(nspaces);
        nstars = 3;
        printStars(nstars);
        printSpaces(nspaces);
        printStars(nstars);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
