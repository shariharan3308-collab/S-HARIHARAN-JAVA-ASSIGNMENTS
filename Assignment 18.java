import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        HashSet<String> groups = new HashSet<>();

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            // Convert string to character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Add sorted string to the set
            groups.add(new String(chars));
        }

        System.out.println("Number of anagramic groups = " + groups.size());

        sc.close();
    }
}
