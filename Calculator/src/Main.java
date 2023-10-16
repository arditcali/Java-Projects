import java.util.Scanner;

public class Main {

    public static void main(String qrgs[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        double nr1 = scan.nextDouble();

        System.out.println("Give operator:");
        String op = scan.next();

        System.out.println("Give the second number:");
        double nr2 = scan.nextDouble();

        if(op.equals("+")) {
            System.out.println(nr1 + nr2);
        }else if(op.equals("-")) {
            System.out.println(nr1 - nr2);
        }else if(op.equals("*")) {
            System.out.println(nr1 * nr2);
        }else if(op.equals("/")) {
            System.out.println(nr1 / nr2);
        }else {
            System.out.println("Invalid operator");
        }
    }
}
