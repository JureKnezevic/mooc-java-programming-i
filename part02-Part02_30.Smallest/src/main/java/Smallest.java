
public class Smallest {

    public static int smallest(int number1, int number2) {
        int result = 0;
        if (number1 < number2) {
            result = number1;
            
            
        } else if (number1 > number2) {
            result = number2;
        }
        
        
        return result;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
