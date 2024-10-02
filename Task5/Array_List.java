package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        
        // Create an ArrayList of integers
        ArrayList<Integer> number = new ArrayList<>();
        
        // Add elements to the ArrayList
        number.add(55);
        number.add(20);
        number.add(91);
        number.add(1);
        number.add(39);
        System.out.println("Original List: " + number);
        
        // Remove the element at index 3 (which is the number 1)
        number.remove(3);
        System.out.println("List after removing element at index 3: " + number);
        
        // Sort the ArrayList
        Collections.sort(number);
        System.out.println("Sorted List: " + number);
    }
}
