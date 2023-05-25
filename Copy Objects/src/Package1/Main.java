package Package2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car1 = new Car("Bmw", "320", 2003);
        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getBrand());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
