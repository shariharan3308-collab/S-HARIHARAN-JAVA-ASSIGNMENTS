class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class ToStringExample {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20);

        // Object is automatically converted to String
        // by calling toString()
        System.out.println(s1);
    }
}
