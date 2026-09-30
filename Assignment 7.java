import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. length()
        System.out.println("Length = " + str.length());

        // 2. toUpperCase()
        System.out.println("Uppercase = " + str.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Lowercase = " + str.toLowerCase());

        sc.close();
    }
}
