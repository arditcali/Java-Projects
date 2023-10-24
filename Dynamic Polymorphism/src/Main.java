import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Create object of:");
        System.out.println("1 - Dog       2 - Cat");
        int answer = scan.nextInt();

        if(answer == 1) {
            Animal animal = new Dog();
            animal.run();
        }else if(answer == 2) {
            Animal animal = new Cat();
            animal.run();
        }
    }
}