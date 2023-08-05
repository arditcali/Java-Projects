
public class Main {

    public static void main(String[] args) {

        String message = "Mjqqt%mt|%fwj%~tzD";
        System.out.println(message);

        char[] chars = message.toCharArray();

        int key = 5;

        for (char c : chars) {
            c-= key;
            System.out.print(c);
        }
    }
}