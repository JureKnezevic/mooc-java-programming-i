
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        int numberCount = 0;

    }

    public void addNumber(int number) {
        // write code here
        count = count + 1;
        sum = sum + number;

    }

    public int getCount() {
        // write code here

        return count;
    }

    public int sum() {

        return sum;
    }

    public double average() {

        if (count == 0) {
            double avg = 0;
            return avg;
        }
        double avg = 1.0 * sum / count;
        return avg;
    }

}
