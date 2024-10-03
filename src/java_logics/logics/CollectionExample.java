package java_logics.logics;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println("List: " + list);
        // Output: List: [apple, banana]

        List<String> otherList = new ArrayList<>();
        otherList.add("banana");
        otherList.add("orange");

        // addAll
        list.addAll(otherList);
        System.out.println("After addAll: " + list);
        // Output: After addAll:   [apple, banana, banana, orange]

        // contains
        System.out.println("Contains 'apple': " + list.contains("apple"));
        // Output: Contains 'apple': true

        // containsAll
        System.out.println("Contains all elements of otherList: " + list.containsAll(otherList));
        // Output: Contains all elements of otherList: true

        // remove
        list.remove("orange");
        System.out.println("After remove: " + list);
        // Output: After remove: [apple, banana, banana]

        // removeAll
        list.removeAll(otherList);
        System.out.println("After removeAll: " + list);
        // Output: After removeAll: [apple]

        // retainAll
        list.add("grape");
        list.addAll(otherList);
        list.retainAll(otherList);
        System.out.println("After retainAll: " + list);
        // Output: After retainAll: [banana, banana, orange]

        // toArray
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
        // Output: Array: [banana, banana, orange]

        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        // peek
        System.out.println("Queue peek: " + queue.peek());
        // Output: Queue peek: first

        // poll
        
        
        System.out.println("Queue poll: " + queue.poll());
        // Output: Queue poll: first

        // Final Queue
        System.out.println("Queue after poll: " + queue);
        // Output: Queue after poll: [second, third]
    }
}

