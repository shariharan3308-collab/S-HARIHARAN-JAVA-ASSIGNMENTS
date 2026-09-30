class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        // Two objects using the same Student class
        Student s1 = new Student("Arun", 85);
        Student s2 = new Student("Kiran", 92);

        System.out.println("Student 1:");
        s1.display();

        System.out.println("\nStudent 2:");
        s2.display();
    }
}
