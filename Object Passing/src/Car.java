public class Car {

    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String toString() {
        return "The car is a " + this.brand + " produced in " + this.year + ".";
    }
}
