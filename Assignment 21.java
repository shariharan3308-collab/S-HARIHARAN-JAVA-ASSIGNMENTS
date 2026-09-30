import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original LinkedList: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 1: " + list.get(1));

        // Removing elements
        list.removeFirst();
        System.out.println("After removing first: " + list);

        list.removeLast();
        System.out.println("After removing last: " + list);

        list.remove(0);
        System.out.println("After removing index 0: " + list);
    }
}
