
public class Main {

    public static void main(String[] args) throws Exception {

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");
    }
}