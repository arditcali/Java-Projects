import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            int x = scan.nextInt(); //enter a number larger than 1

            System.out.println("Enter second number:");
            int y = scan.nextInt(); //enter number 0 or any letter

            int z = x / y;

            System.out.println(z);
        }catch(ArithmeticException e) {
            System.out.println("Cant divide by 0");
        }catch(InputMismatchException e) {
            System.out.println("Cant divide by a letter");
        }
    }
}