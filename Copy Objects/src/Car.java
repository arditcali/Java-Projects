public class Car {

    String brand;
    int dateProduced;
    int cc;

    Car(String brand, int dateProduced, int cc) {
        this.brand = brand;
        this.dateProduced = dateProduced;
        this.cc = cc;
    }

    Car(Car x) {
        this.copy(x);
    }

    public void copy(Car x) {
        this.brand = x.brand;
        this.dateProduced = x.dateProduced;
        this.cc = x.cc;
    }

    public String toString() {
        return "Car is " + this.brand + ", produced in " + this.dateProduced + " with cubic capacity " + this.cc;
    }
}
