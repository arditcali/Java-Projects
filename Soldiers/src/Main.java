import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Whats the soldier name?");
        String name = scan.nextLine();

        System.out.println("Whats the soldier age?");
        int age = scan.nextInt();

        Soldier soldier = new Soldier(name, age);

        soldier.age();
        soldier.print();
    }
}