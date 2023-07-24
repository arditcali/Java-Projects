import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.name = "Bro";
        user.pasword = "welcome";

        try {
            FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
        }catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }finally {
            System.out.println("Object saved");
        }
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
