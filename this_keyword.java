class Student {
    String name;
    int age;

    // constructor using 'this' keyword
    Student(String name, int age) {
        this.name = name;  // 'this' refers to current object's variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class this_keyword{
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Priya", 19);

        s1.display();
        s2.display();
    }
}
