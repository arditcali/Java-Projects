
public class Main {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", 2020, 450);
        Car vw = new Car("VW", 2015, 270);

        System.out.println(bmw);
        System.out.println(vw);

        vw.copy(bmw);

        System.out.println(bmw);
        System.out.println(vw);

        Car mazda = new Car(bmw);
        System.out.println(mazda);
    }
}