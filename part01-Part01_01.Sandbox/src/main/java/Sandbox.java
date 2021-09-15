
import java.util.HashMap;

public class Sandbox {

    public static void main(String[] args) {
        
        
        
        int year = 1968;
        double percentage = Double.valueOf(16.1);
        
        HashMap<Integer, Double> test = new HashMap<>();
        test.put(year, percentage);
        System.out.println(test.values());
        
    }
}
