
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter name, empty input stops:");
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String name = input;
            

            System.out.println("Duration: ");
            input = scanner.nextLine();
            int duration = Integer.valueOf(input);
            
            programs.add(new TelevisionProgram(name, duration));

        }
        
        System.out.println("Program's maximum duration?");
        int maxdur = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxdur) {
                System.out.println(program);
            }
        }

    }
}
