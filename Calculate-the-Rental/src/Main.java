import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Give the anual rent:");
        int rent = Integer.valueOf(scan.nextLine());

        System.out.println("Give the purchased property price:");
        int purchase = Integer.valueOf(scan.nextLine());

        double rentalYield = form(rent, purchase);

        System.out.println(rentalYield + " %");

    }
    private static double form(int rental, int purchase){
        double anualRent = rental * 12;
        double rentalYield = (anualRent / purchase) * 100;

        return rentalYield;
    }
}