import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            User user = null;
            FileInputStream fileIn = new FileInputStream("C:\\Users\\1\\Documents\\IntelliJ IDEA\\Deserialization");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();

            System.out.println(user.name);
            System.out.println(user.pasword);
        }catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }finally {
            System.out.println("Converted from byte code");
        }
    }
}