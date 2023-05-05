import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scan.nextLine();

        System.out.println("Search for:");
        String name = scan.nextLine();

        try(Scanner read = new Scanner(Paths.get(file))) {
            while(read.hasNextLine()) {
                String row = read.nextLine();
                list.add(row);
            }
        }catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if(list.contains(name)) {
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
    }
}