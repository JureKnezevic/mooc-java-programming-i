import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int pages;
        int year;
        
        while (true) {
            
            System.out.println("Title:");
            name = scanner.nextLine();
            String input = name;
            
            if (name.equals("")) {
                break;
            }
            
            System.out.println("Pages:");
            pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            year = Integer.valueOf(scanner.nextLine());
                   
            
            books.add(new Book(name, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String print = scanner.nextLine();
        
        if (print.equals("everything")) {
            
            for (Book everything : books)
            System.out.println(everything);
            
        }
        
        if (print.equals("name")) {
            
            for (Book names : books) {
                System.out.println(names.getName());
            }
            
        }
        
        

    }
}
