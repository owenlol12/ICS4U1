package Assignment2;
/**
 * A class that provides sorting methods
 * @author owenlol
 */
public class Sort {
    /**
        * Sorts an array of integers in ascending order using the selection sort algorithm.
        * * @param arr The array of integers to be sorted.
        */
    public void sort(int[] arr) {
        // for loop
        for (int i = 0; i < arr.length - 1; i++) {  
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            //swapping the smallest element with the current element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
