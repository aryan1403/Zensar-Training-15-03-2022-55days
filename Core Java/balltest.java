import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class balltest {
    public static void main(String[] args) {
        try {
            // Serializaion 
            Ball b = new Ball("Red", 80, "Leather", "Cricket");
            FileOutputStream fo = new FileOutputStream("meow.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(b);
            oos.flush();
            oos.close();
            fo.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
