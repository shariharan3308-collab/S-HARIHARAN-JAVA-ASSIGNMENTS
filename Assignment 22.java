import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Read a book");
        tasks.add("Go for a walk");

        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out
