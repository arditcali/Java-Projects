package myProg;

public class Car {

    String brand;
    int year;
    int hp;
    int topSpeed;

    Car(String brand, int year, int hp, int topSpeed) {
        this.brand = brand;
        this.year = year;
        this.hp = hp;
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(int newTopSpeed) {
        this.topSpeed = newTopSpeed;
    }

    public void print() {
        System.out.println("This car is a " + this.brand + " produced in " + this.year + " it has " + this.hp + " horse power and it has a top speed of " + this.topSpeed + " km/h");
    }
}
