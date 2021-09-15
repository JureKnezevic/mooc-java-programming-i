
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {

        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }

        }

        return smallest;

    }

    public static int indexOfSmallest(int[] array) {

        int i = 0;
        int smallest = smallest(array);

        while (true) {
            if (smallest == array[i]) {
                return i;
            }
            i++;
        }
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int i = startIndex;
        int smallest = table[i];
        int indexSmallest = startIndex;

        for (i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] numbers) {

        int repeat = 0;

        while (true) {
            swap(numbers, repeat, indexOfSmallestFrom(numbers, repeat));
            repeat++;
            
            if (repeat == numbers.length) {
                break;
            }
        }
    }
}
