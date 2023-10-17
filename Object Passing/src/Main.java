
public class Main {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", 2020);
        Garage garage = new Garage();

        garage.park(bmw);
    }
}
