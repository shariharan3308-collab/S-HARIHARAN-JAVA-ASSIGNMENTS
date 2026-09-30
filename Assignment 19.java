import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        // Find two numbers whose sum is target
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        // If no pair exists
        if (!found) {
            System.out.println("[-1, -1]");
        }

        sc.close();
    }
}
