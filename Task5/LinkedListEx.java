package Task5;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {
    	
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(23);
        numbers.add(70);
        numbers.add(45);
        numbers.add(11);
        numbers.add(98);
        numbers.add(2);

        System.out.println("LinkedList: " + numbers);

        // Get the size of the LinkedList
        System.out.println("Size of LinkedList: " + numbers.size());

        // Remove the element at index 3 (which is the number 11)
        System.out.println("Element removed at index 3: " + numbers.remove(3));

        // Display the LinkedList after removal
        System.out.println("LinkedList after removal: " + numbers);

        numbers.addFirst(99);
        System.out.println("LinkedList after adding 99 at the beginning: " + numbers);

        numbers.addLast(77);
        System.out.println("LinkedList after adding 77 at the end: " + numbers);

        // Sort the LinkedList in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted LinkedList: " + numbers);
    }
}
