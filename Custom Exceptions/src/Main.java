import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give age:");
        int age = scan.nextInt();

        try {
            getAgeException(age);
        } catch(Exception e) {
            System.out.println("Error " + e);
        }
    }
    static void getAgeException(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("Not allowed inside the club.");
        }else {
            System.out.println("Allowed.");
        }
    }
}
