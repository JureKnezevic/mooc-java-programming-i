
import java.util.Objects;


public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object comparedBook) {
        
        if (this == comparedBook) {
            return true;
        }
        
        if (!(comparedBook instanceof Book)) {
            return false;
        }
        
        Book secondBook = (Book) comparedBook;
        
        if (this.name.equals(secondBook.name) && this.publicationYear == secondBook.publicationYear) {
            return true;
        }
        
        return false;
    }


}
