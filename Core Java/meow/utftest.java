package meow;

import java.io.IOException;
import java.io.RandomAccessFile;

public class utftest {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("meow.txt", "rw");
            // raf.seek(1);
            // raf.writeBytes("12345");
            System.out.println(raf.readLine());
            raf.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
