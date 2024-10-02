package Task5;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        // Create a HashSet of integers
        Set<Integer> numbers = new HashSet<Integer>();
        
        // Add elements to the HashSet
        numbers.add(55);
        numbers.add(20);
        numbers.add(73);
        numbers.add(11);
        numbers.add(100);
        numbers.add(-2);
        
        // Display the elements in the HashSet
        System.out.println("HashSet: " + numbers);
        
        // Display the size of the HashSet
        System.out.println("Size of HashSet: " + numbers.size());
        
        // Remove the element 11 from the HashSet
        System.out.println("Is 11 removed? " + numbers.remove(11));
        
        // Display the HashSet after removal
        System.out.println("HashSet after removal: " + numbers);
    }
}
