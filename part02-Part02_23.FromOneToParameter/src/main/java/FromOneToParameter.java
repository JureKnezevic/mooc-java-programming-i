
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int end = Integer.valueOf(scanner.nextLine());
        //int printn = 0;

        //while (printn < end) {
        printUntilNumber(end);
        //    printn = printn + 1;
        //    continue;
        //}

    }

    public static void printUntilNumber(int print) {

        int i = 1;
        

        while (i <= print) {
            System.out.println(i);
            i++;
            

        }

    }
}