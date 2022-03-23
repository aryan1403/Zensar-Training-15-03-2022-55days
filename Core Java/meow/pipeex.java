package meow;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class pipeex {
    public static void main(String[] args) {
        try {
            PipedInputStream pi = new PipedInputStream(); // input stream
            PipedOutputStream po = new PipedOutputStream();

            pi.connect(po);
            po.write(65); // ASCII value of A
            // System.out.println(pi.available());
            System.out.println((char) pi.read());

            pi.close();
            po.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
