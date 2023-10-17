package myProg;

public class Main {

    public static void main(String [] args) {

        Car bmw = new Car("BMW", 2022, 550, 320);
        Car vw = new Car("VW", 2020, 450, 300);
        Car toyota = new Car("Toyota", 2010, 350, 260);

        Car[] cars = new Car[3];
        cars[0] = bmw;
        cars[1] = vw;
        cars[2] = toyota;

        for (Car x : cars) {
            x.print();
        }
    }
}
