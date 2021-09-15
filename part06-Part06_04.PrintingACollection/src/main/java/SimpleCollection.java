
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

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        String outputPrint = outputPrint = "The collection " + this.name + " has " + elements.size() + " elements:";

        if (elements.isEmpty()) {
            outputPrint = "The collection " + this.name + " is empty.";
            return outputPrint;
        } else if (elements.size() == 1) {
            outputPrint = "The collection " + this.name + " has " + elements.size() + " element:";
            return outputPrint + "\n" + elements.get(0);
        }
        String elementi = "";

        //for (String name : getElements()) {
        //    elementi = elementi + getElements() + "\n";
        //}
        int i = 0;
        while (i < elements.size()) {
            elementi = elementi + elements.get(i) + "\n";
            i++;
        }
        return outputPrint + "\n" + elementi;
        //return outputPrint + "\n" + elementi + "\n";
        
    }
    
    

}
