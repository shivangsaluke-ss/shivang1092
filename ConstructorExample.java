class Student {
    String name;

    // Constructor with argument
    Student(String studentName) {
        name = studentName;  // assigning value to instance variable
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // creating objects and passing arguments
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Priya");

        // displaying names
        s1.display();
        s2.display();
    }
}
