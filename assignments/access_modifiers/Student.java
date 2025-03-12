package assignments.access_modifiers;

public class Student {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Person age: " + person.age); // .name is private (so not accessible from here)
        person.displayInfo();
    }
}
