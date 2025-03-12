package assignments.access_modifiers;

public class Person {
    private String name;
    protected int age;
    public String country;

    private void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    public static void main(String[] args) {
        Person p1 =  new Person();
        p1.setName("Shyam");
    }
}
