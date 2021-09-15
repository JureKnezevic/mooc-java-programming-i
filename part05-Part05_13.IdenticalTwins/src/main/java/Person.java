
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;
    private int day;
    private int month;
    private int year;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    
    
    public boolean equals(Object compared) {
        
        
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Person)) {
            return false;
        }
        
        Person comparedPerson = (Person) compared;
        
        if (this.name.equals(comparedPerson.name) && this.birthday.equals(comparedPerson.birthday) && this.height == comparedPerson.height && this.weight == comparedPerson.weight ) {
            
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.name + "." + this.birthday + "." + this.height + "." + this.weight;
    }

    // implement an equals method here for checking the equality of objects
}
