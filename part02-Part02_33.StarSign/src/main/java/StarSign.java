
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {

        int times = 1;
        String printStars = "";

        while (times <= number) {

            printStars = printStars + "*";

            times++;

        }

        System.out.println(printStars);
    }

    public static void printSquare(int size) {
        // second part of the exercise

        int column = 1;
        int row = 1;
        String printStarsRow = "";

        while (column <= size) {

            printStarsRow = printStarsRow + "*";

            column++;

        }

        while (row <= size) {

            System.out.println(printStarsRow);

            row++;

        }

    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int column = 1;
        int row = 1;

        String printStarsRow = "";

        while (column <= width) {

            printStarsRow = printStarsRow + "*";

            column++;
        }

        while (row <= height) {

            System.out.println(printStarsRow);
            row++;

        }

    }

    public static void printTriangle(int size) {
        // fourth part of the exercise

        String printStarsRow = "";
        int row = 1;

        while (row <= size) {
            printStarsRow = printStarsRow + "*";
            System.out.println(printStarsRow);

            row++;
        }

    }
}
