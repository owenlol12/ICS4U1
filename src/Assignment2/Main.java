
package Assignment2;
import java.util.*;
/**
 Sorts an inputted array using the selection sort created in the 'Sort' class
 * @author owenlol
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ask for length of array
        System.out.println("Enter number of integers");
        int amount = scanner.nextInt();
        
        int[] list = new int[amount];
        
        // ask to enter integers repeated until the total amount of ints gets to the number inputted for length
        System.out.println("Enter the " + amount + " integers:");
        for (int i = 0; i < amount; i++) {
            list[i] = scanner.nextInt();
        }
        
        // print original array
        System.out.println("Original array: " + Arrays.toString(list));
        
        // create an instance of sort class and sort the array
        Sort selection = new Sort();
        selection.sort(list);
        
        // print the new & sorted array
        System.out.println("Sorted array: " + Arrays.toString(list));
        
        scanner.close();
    }
}