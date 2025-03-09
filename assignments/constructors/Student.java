package assignments.constructors;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void updateName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.displayDetails();
        s1.updateName("Bob");
        s1.displayDetails();
    }
}
