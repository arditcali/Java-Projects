import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("textFile.txt");
            writer.write("Hello World\n");
            writer.write("Goodbye World\n");
            writer.append("The End");
            writer.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}