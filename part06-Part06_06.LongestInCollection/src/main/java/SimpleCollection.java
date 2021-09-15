
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }
    
    public String longest() {
        
        if (elements.isEmpty()) {
            return null;
        }
        
        String temporary = "";
        String longest = "";
        
        for (String lng: elements) {
            longest = lng;
            if (temporary.length() < longest.length()) {
                temporary = lng;
            }
        }
        
        
        return temporary;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    

}
