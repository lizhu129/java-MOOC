
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (a > array[i]) {
                a = array[i];
                continue;
            }
            continue;
            }
        return a;
        }
    
    public static int indexOfSmallest(int[] array){
        int a = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (a > array[i]) {
                a = array[i];
                index = i;
                continue;
            }
            continue;
            }
        return index;
        }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int a = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (a > table[i]) {
                a = table[i];
                index = i;
                continue;
            }
            continue;
        }   
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);            
        }
    }    
}
