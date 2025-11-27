class Car {
    String make, model;
    int year;

    // Constructor
    Car(String m, String mod, int y) {
        make = m;
        model = mod;
        year = y;
    }

    // Method to display
    void display() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object and display in one go
        Car c = new Car("Toyota", "Camry", 2023);
        c.display();
    }
}