
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        
        array[2] = 10;

        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int n = 0;

        while (n < array.length) {
            int i = 0;

            while (i < array[n]) {

                String star = "";
                star = "*" + star;
                System.out.print(star);

                i++;
            }
            System.out.println("");
            n++;

        }

    }

}
