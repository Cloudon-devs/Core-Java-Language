package assignments.constructors;

public class Car {
    String brand;
    String model;
    int year;

    Car() {
        System.out.println("Car object created");
    }

    Car(String brand, String model, int year) {
        this();

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 2015);
        Car c2 = new Car();
        c1.displayCarInfo();
        c2.displayCarInfo();
    }
}
