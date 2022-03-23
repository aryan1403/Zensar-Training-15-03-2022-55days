package meow;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class spipex {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("meow.txt");
            FileInputStream f2 = new FileInputStream("meow.txt");

            SequenceInputStream si = new SequenceInputStream(f1, f2);

            int j;
            while((j=si.read()) != -1) {
                System.out.print((char) j);
            }
            si.close();
            f1.close();
            f2.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
