
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(start);

    }

    public static void printFromNumberToOne(int start2) {

        int i = 0;

        while (i < start2) {

            System.out.println(start2 - i);

            i = i + 1;
            continue;
        }

    }    

}
