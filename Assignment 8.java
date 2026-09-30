import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Rebuild sentence in new format
        String newSentence = "";

        for (String word : words) {
            newSentence = newSentence + word + "-";
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("New format: " + newSentence);

        sc.close();
    }
}
