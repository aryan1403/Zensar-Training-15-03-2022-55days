import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
    public static void main(String[] args) {
        try {
            File file = new File("day1/names.txt");
            FileReader reader = new FileReader(file);
            String data = "";
            System.out.print("Previous data : ");
            while(true) {
                int value = reader.read();
                if(value == -1) {
                    break;
                }
                data += ((char) value);
                System.out.println((char) value);
            }
            // writer.append(data + "Aaryan");
            reader.close();

            FileWriter writer = new FileWriter(file);
            writer.append(data + " meow");
            writer.close();
        } catch(IOException f) {
            System.out.println("File not found");
        }
    }
}
