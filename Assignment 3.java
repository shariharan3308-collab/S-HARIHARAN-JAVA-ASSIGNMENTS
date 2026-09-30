import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        // Check pass or fail
        if (marks >= 70) {
            System.out.println("Student has Passed.");
        } else {
            System.out.println("Student has Failed.");
        }

        // Assign Grade A
        if (marks > 90) {
            System.out.println("Grade: A");
        }

        sc.close();
    }
}
